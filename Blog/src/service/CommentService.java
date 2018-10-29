package service;

import common.UserInfo;

public interface CommentService {
	
	public void getComments(UserInfo userInfo);
	public void addComment(UserInfo userInfo) throws Exception;

}
