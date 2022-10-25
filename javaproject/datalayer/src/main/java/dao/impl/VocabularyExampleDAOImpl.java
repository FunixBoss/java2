package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.VocabularyExampleDAO;
import database.ConnectDBFromProperties;
import entity.VocabularyExample;

public class VocabularyExampleDAOImpl implements VocabularyExampleDAO{
	private List<VocabularyExample> list;

	public VocabularyExampleDAOImpl() {
		if (this.list == null) {
			list = selectAll();
		}
	}

	public List<VocabularyExample> getList() {
		return list;
	}
	
	@Override
	/**
	 * @return null if it doesn't exist
	 */
	public VocabularyExample select(Integer id) {
		VocabularyExample ve = null;
		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call selVocabEx(?)}");) {
			cs.setInt(1, id);
			var rs = cs.executeQuery();

			if (rs.next()) {
				Integer bmId = rs.getInt(1);
				Integer vocabId = rs.getInt(2);
				Integer exId = rs.getInt(3);
				ve = new VocabularyExample(bmId, vocabId, exId);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Select A Vocabulary Example Failed!");
		}
		return ve;
	}
	
	@Override
	/**
	 * @return null if doesn't have any
	 */
	public List<VocabularyExample> selectAll() {
		List<VocabularyExample> list = new ArrayList<>();
		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call selAllVocabEx}");
				var rs = cs.executeQuery();) {
			while (rs.next()) {
				Integer bmId = rs.getInt(1);
				Integer vocabId = rs.getInt(2);
				Integer exId = rs.getInt(3);
				list.add(new VocabularyExample(bmId, vocabId, exId));
			}
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Select all Vocabulary Example  failed!");
		}
		return list.isEmpty() ? null : list;
	}
	
	@Override
	/**
	 * @return 0 for insert failed
	 * @return 1 for insert successfully
	 */
	public Integer insert(VocabularyExample ve) {
		Integer result = 0;
		try (
			var con = ConnectDBFromProperties.getConnectionFromClassPath();
			var cs = con.prepareCall("{call insertVocabEx(?, ?)}")
		) {
			cs.setInt(1, ve.getVocabularyId());
			cs.setInt(2, ve.getexampleId());
			result = cs.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Insert Vocabulary Example failed!");
		}
		return result;
	}
	
	@Override
	/**
	 * @return 0 for update failed
	 * @return 1 for update successfully
	 */
	public Integer update(VocabularyExample ve) {
		Integer result = 0;
		try (var con = ConnectDBFromProperties.getConnectionFromClassPath();
				var cs = con.prepareCall("{call updateVocabEx(?, ?, ?)}");) {
			cs.setInt(1, ve.getId());
			cs.setInt(2, ve.getVocabularyId());
			cs.setInt(3, ve.getexampleId());
			result = cs.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Update VocabularyExample failed");
		}
		return result;
	}
	
	@Override
	/**
	 * @return 0 for delete failed
	 * @return 1 for delete successfully
	 */
	public Integer delete(VocabularyExample ve) {
		Integer result = 0;
		try (
			var con = ConnectDBFromProperties.getConnectionFromClassPath();
			var cs = con.prepareCall("{call deleteVocabEx(?)}");
		) {
			cs.setInt(1, ve.getId());
			result = cs.executeUpdate();
		} catch (Exception e) {
//			e.printStackTrace();
			System.err.println("Delete a VocabEx failed");
		}
		return result;
	}
	
}
