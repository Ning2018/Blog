package dao;

import java.util.List;

import entity.Comment;

public interface CommentDao {
	
	public void addComment(Comment comment);
	public List<Comment> getComments(String hql, Object...params);

}
