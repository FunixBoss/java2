package entity;

public class VocabularyMeaning extends Entity {
	private Integer meaningId;
	private Integer vocabularyId;

	public VocabularyMeaning() {
		super();
	}

	public VocabularyMeaning(Integer id, Integer meaningId, Integer vocabularyId) {
		super(id);
		this.meaningId = meaningId;
		this.vocabularyId = vocabularyId;
	}

	public Integer getMeaningId() {
		return meaningId;
	}

	public void setMeaningId(Integer meaningId) {
		this.meaningId = meaningId;
	}

	public Integer getVocabularyId() {
		return vocabularyId;
	}

	public void setVocabularyId(Integer vocabularyId) {
		this.vocabularyId = vocabularyId;
	}

	@Override
	public String toString() {
		return "VocabularyMeaning [id=" + id + ", meaningId=" + meaningId + ", vocabularyId=" + vocabularyId + "]";
	}

}
