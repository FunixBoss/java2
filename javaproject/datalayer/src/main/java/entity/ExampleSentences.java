package entity;

public class ExampleSentences extends Entity {
	private String content;
	private Integer vocabularyId;

	public ExampleSentences() {
		super();
	}

	public ExampleSentences(Integer id, String content, Integer vocabularyId) {
		super(id);
		this.content = content;
		this.vocabularyId = vocabularyId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getVocabularyId() {
		return vocabularyId;
	}

	public void setVocabularyId(Integer vocabularyId) {
		this.vocabularyId = vocabularyId;
	}

	@Override
	public String toString() {
		return "ExampleSentences [id=" + id + ", content=" + content + ", vocabularyId=" + vocabularyId + "]";
	}

}
