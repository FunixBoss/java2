package entity;

public class Meaning extends Entity {
	private String content;

	public Meaning() {
		super();
	}

	public Meaning(Integer id, String content) {
		super(id);
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Meaning [id=" + id + ", content=" + content + "]";
	}

	
}
