package entity;

public class Example extends Entity {
	private String content;

	public Example() {
		super();
	}

	public Example(Integer id, String content) {
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
		return "Example [id=" + id + ", content=" + content + "]";
	}

}
