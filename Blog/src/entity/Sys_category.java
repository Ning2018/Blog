package entity;

public class Sys_category {
	
	private String category_name;
	private int articals;
	private boolean is_delete;
	
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getArticals() {
		return articals;
	}
	public void setArticals(int articals) {
		this.articals = articals;
	}
	public boolean isIs_delete() {
		return is_delete;
	}
	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}
	@Override
	public String toString() {
		return "Sys_category [category_name=" + category_name + ", articals=" + articals + ", is_delete=" + is_delete
				+ "]";
	}

}
