package idao;

import entity.User;

public interface UserDAO extends DAO<User> {
	int updatePrivateInfoUser(User user);
	int updatePassword(User user);
}
