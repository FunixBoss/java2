package dao;

import java.util.List;

import dao.VocabularyDAO;
import dao.VocabularyExampleDAO;
import dao.impl.VocabularyExampleDAOImpl;
import entity.VocabularyExample;

public class TestVocabEx implements VocabularyExampleDAO{
	public static void main(String[] args) {
		TestVocabEx test = new TestVocabEx();
		VocabularyExample vocabex = new VocabularyExample(1, 10);
		VocabularyExample vocabex2 = new VocabularyExample(1, 10, 10);
//		System.out.println(test.select(3));
//		System.out.println(test.update(vocabex2));
//		System.out.println(test.insert(vocabex));
		System.out.println(test.delete(test.select(4)));
		
		test.selectAll().forEach(System.out::println);
	}
	@Override
	public VocabularyExample select(Integer id) {
		return new VocabularyExampleDAOImpl().select(id);
	}

	@Override
	public List<VocabularyExample> selectAll() {
		return new VocabularyExampleDAOImpl().selectAll();
	}

	@Override
	public Integer insert(VocabularyExample t) {
		return new VocabularyExampleDAOImpl().insert(t);
	}

	@Override
	public Integer update(VocabularyExample t) {
		return new VocabularyExampleDAOImpl().update(t);
	}

	@Override
	public Integer delete(VocabularyExample t) {
		return new VocabularyExampleDAOImpl().delete(t);
	}

}
