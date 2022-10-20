package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import database.ConnectDBFromProperties;
import entity.User;
import idao.UserDAO;

public class UserDAOImpl implements UserDAO {
//	fields
	private List<User> list;

//	constructors
	public UserDAOImpl() {
		if (list == null) {
			list = selectAll();
		}
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	/**
	 * @return null if it doesn't exists 
	 */
	public User select(Integer id) {
		User user = null;
		try (
			var con = ConnectDBFromProperties.getConnectionFromClassPath();
			var cs = con.prepareCall("{call selUser(?)}");
		) {
			cs.setInt(1, id);
			var rs = cs.executeQuery();

			if (rs.next()) {
				Integer user_id = rs.getInt(1);
				String email = rs.getString(2);

//				Can be null
//				String fullname = null;
				String fullname = rs.getString(3);

//				String phoneNumber = null;
				String phoneNumber = rs.getString(4);
				LocalDate dob = null;
				if(rs.getDate(5) != null) {
					dob = LocalDate.parse(rs.getDate(5).toString(), DateTimeFormatter.ofPattern("[yyyy-MM-dd]"));
				}
				Integer level = rs.getInt(6);
				LocalDate createdAt = LocalDate.parse(rs.getDate(7).toString(),
						DateTimeFormatter.ofPattern("[yyyy-MM-dd]"));
				LocalDate updatedAt = LocalDate.parse(rs.getDate(8).toString(),
						DateTimeFormatter.ofPattern("[yyyy-MM-dd]"));

				user = new User(user_id, email, null, level, fullname, phoneNumber, dob, createdAt, updatedAt);
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Get a user failed!");
		}
		return user;
	}

	@Override
	/**
	 *  @return null if doesn't have anyone
	 */
	public List<User> selectAll() {
		List<User> list = null;

		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call selAllUser}");
				var rs = cs.executeQuery();) {
			while (rs.next()) {
				list = new ArrayList<>();
				var user = new User();
				Integer id = rs.getInt(1);
				String email = rs.getString(2);

//				Can be null
				String fullname = null;
				if (rs.getString(3) != null) {
					fullname = rs.getString(3);
				}

				String phoneNumber = null;
				if (rs.getString(4) != null) {
					phoneNumber = rs.getString(4);
				}
				LocalDate dob = null;
				if (rs.getDate(5) != null) {
					dob = LocalDate.parse(rs.getDate(5).toString(), DateTimeFormatter.ofPattern("[yyyy-MM-dd]"));
				}
				Integer level = rs.getInt(6);
				LocalDate createdAt = LocalDate.parse(rs.getDate(7).toString(),
						DateTimeFormatter.ofPattern("[yyyy-MM-dd]"));
				LocalDate updatedAt = LocalDate.parse(rs.getDate(8).toString(),
						DateTimeFormatter.ofPattern("[yyyy-MM-dd]"));

				list.add(new User(id, email, null, level, fullname, phoneNumber, dob, createdAt, updatedAt));
			}
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Get list of user failed!");
		}

		return list;
	}

	@Override
	/**
	 * @param User Entity
	 * @return 0 for insert failed
	 * @return 1 for insert successfully
	 */
	public int insert(User user) {
		int result = 0;
		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call insertUser(?, ?, ?, ?, ?, ?)}");) {
			// must be validate before insert
			cs.setString(1, user.getEmail());
			cs.setString(2, user.getPassword());
			cs.setInt(3, user.getLevel());

//			can be null
			cs.setString(4, user.getFullname());
			cs.setDate(5, Date.valueOf(user.getDateOfBirth()));
			cs.setDate(5, null);
			cs.setString(6, user.getPhoneNumber());

			result = cs.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Insert User Failed");
		}

		return result;
	}

	@Override
	/**
	 * @param User Entity
	 * @return 0 for update private info failed
	 * @return 1 for update private info successfully
	 */
	public int updatePrivateInfoUser(User user) {
		int result = 0;
		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call UpdatePrivateInfoUser(?, ?, ?, ?)}");) {
			cs.setInt(1, user.getId());
			cs.setString(2, user.getFullname());
			cs.setDate(3, Date.valueOf(user.getDateOfBirth()));
			cs.setDate(3, null);
			cs.setString(4, user.getPhoneNumber());
			result = cs.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Update User Failed");
		}
		return result;
	}

	@Override
	/**
	 * @param User Entity
	 * @return 0 for update private info failed
	 * @return 1 for update private info successfully
	 */
	public int updatePassword(User user) {
		int result = 0;
		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call UpdatePasswordInfoUser(?, ?)}");) {
			cs.setInt(1, user.getId());
			cs.setString(2, user.getPassword());
			result = cs.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Update User Password Failed");
		}
		return result;
	}
	
	@Override
	/**
	 * @return 1 if success
	 * @return 0 if failed
	 */
	public int delete(User user) {
		int result = 0;
		try(
			var con = ConnectDBFromProperties.getConnectionFromClassPath();
			var cs = con.prepareCall("{call delUser(?)}");
		){
			cs.setInt(1, user.getId());
			result = cs.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Delete a user failed!");
		}
		return result;
	}

}
