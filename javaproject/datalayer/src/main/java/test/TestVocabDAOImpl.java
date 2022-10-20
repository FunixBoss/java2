
package test;

import java.util.List;

import dao.VocabularyDAOImpl;
import entity.Vocabulary;

public class TestVocabDAOImpl {
	public static void main(String[] args) {
		Vocabulary vocab = new Vocabulary("Hello Em Yeu", "/image/hello.jpg", "/pronunciation/hello.mp3", null, null, null, 2);
//		System.out.println(selectAVocab(2)); // done
//		selectAllVocab().forEach(System.out::println); // done
//		System.out.println(insertVocab(vocab)); // done
//		System.out.println(deleteVocab(selectAVocab(7))); // done
	}
	
	public static Vocabulary selectAVocab(Integer id) {
//		return new VocabularyDAOImpl().select(1); // done

		return new VocabularyDAOImpl().select(id); // return null
	}
	
	public static List<Vocabulary> selectAllVocab(){
		return new VocabularyDAOImpl().selectAll();
	}
	
	public static int insertVocab(Vocabulary vocab) {
		return new VocabularyDAOImpl().insert(vocab);
	}
	public static int deleteVocab(Vocabulary vocab) {
		return new VocabularyDAOImpl().delete(vocab);
	}
}
