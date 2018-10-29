package entity;

import java.util.Date;

public class Article {
	
	private int id;
	private String title;
	private User user;
	private User lastReplyUser;
	private String summary; //文章摘要  没有用到
	private Date postArticleTime;
	private Date lastReplyTime;
	private Date lastEditTime;
	
	private boolean is_top;
	private boolean is_delete;
	
	private int viewCount;
	private int replyCount;

	private String articlePath;
	
//	private Sys_category sys_category;
//	private Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getLastReplyUser() {
		return lastReplyUser;
	}

	public void setLastReplyUser(User lastReplyUser) {
		this.lastReplyUser = lastReplyUser;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getPostArticleTime() {
		return postArticleTime;
	}

	public void setPostArticleTime(Date postArticleTime) {
		this.postArticleTime = postArticleTime;
	}

	public Date getLastReplyTime() {
		return lastReplyTime;
	}

	public void setLastReplyTime(Date lastReplyTime) {
		this.lastReplyTime = lastReplyTime;
	}

	public boolean isIs_top() {
		return is_top;
	}

	public void setIs_top(boolean is_top) {
		this.is_top = is_top;
	}

	public boolean isIs_delete() {
		return is_delete;
	}

	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}

	public String getArticlePath() {
		return articlePath;
	}

	public void setArticlePath(String articlePath) {
		this.articlePath = articlePath;
	}
/*
	public Sys_category getSys_category() {
		return sys_category;
	}

	public void setSys_category(Sys_category sys_category) {
		this.sys_category = sys_category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
*/
	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", user=" + user + ", lastReplyUser=" + lastReplyUser
				+ ", summary=" + summary + ", postArticleTime=" + postArticleTime + ", lastReplyTime=" + lastReplyTime
				+ ", lastEditTime=" + lastEditTime + ", is_top=" + is_top + ", is_delete=" + is_delete + ", viewCount="
				+ viewCount + ", replyCount=" + replyCount + ", articlePath=" + articlePath + "]";
	}


}
