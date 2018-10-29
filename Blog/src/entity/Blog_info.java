package entity;

public class Blog_info {

	private String blog_name;
	private String description;
	private String announcement;
	
	public String getBlog_name() {
		return blog_name;
	}
	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAnnouncement() {
		return announcement;
	}
	public void setAnnouncement(String announcement) {
		this.announcement = announcement;
	}
	@Override
	public String toString() {
		return "Blog_info [blog_name=" + blog_name + ", description=" + description + ", announcement=" + announcement
				+ "]";
	}
	
}
