package entity;

import java.sql.Time;

public class Comment {
	
	private int id;
	private int articleId;
	private User commentUser;
	private Time commentTime;
	private boolean is_delete;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public User getCommentUser() {
		return commentUser;
	}
	public void setCommentUser(User commentUser) {
		this.commentUser = commentUser;
	}
	public Time getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Time commentTime) {
		this.commentTime = commentTime;
	}
	public boolean isIs_delete() {
		return is_delete;
	}
	public void setIs_delete(boolean is_delete) {
		this.is_delete = is_delete;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", articleId=" + articleId + ", commentUser=" + commentUser + ", commentTime="
				+ commentTime + ", is_delete=" + is_delete + "]";
	}

}
