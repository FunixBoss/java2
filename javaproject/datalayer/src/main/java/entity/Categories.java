package entity;

public class Categories extends Entity {
	private String name;
	private String imageIcon;
	private Integer parentId;

	public Categories() {
		super();
	}

	public Categories(Integer id, String name, String imageIcon, int parentId) {
		super(id);
		this.name = name;
		this.imageIcon = imageIcon;
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(String imageIcon) {
		this.imageIcon = imageIcon;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", name=" + name + ", imageIcon=" + imageIcon + ", parentId=" + parentId + "]";
	}


}
