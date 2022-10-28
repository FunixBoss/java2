package entity;

public class VocabularyExample extends Entity {
	private Integer vocabularyId;
	private Integer exampleId;

	public VocabularyExample() {
		super();
	}

	public VocabularyExample(Integer vocabularyId, Integer exampleId) {
		this.vocabularyId = vocabularyId;
		this.exampleId = exampleId;
	}
	
	public VocabularyExample(Integer id, Integer vocabularyId, Integer exampleId) {
		super(id);
		this.vocabularyId = vocabularyId;
		this.exampleId = exampleId;
	}

	public Integer getVocabularyId() {
		return vocabularyId;
	}

	public void setVocabularyId(Integer vocabularyId) {
		this.vocabularyId = vocabularyId;
	}

	public Integer getexampleId() {
		return exampleId;
	}

	public void setexampleId(Integer exampleId) {
		this.exampleId = exampleId;
	}

	@Override
	public String toString() {
		return "VocabularyExample [id=" + id + ", vocabularyId=" + vocabularyId + ", exampleId="
				+ exampleId + "]";
	}

}
