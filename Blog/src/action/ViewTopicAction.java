package action;

import java.io.File;

import service.CommentService;

public class ViewTopicAction extends BaseAction {
	
	
	public String execute() throws Exception
	{
		String article_randomStr= request.getParameter("path");
		String article_user = request.getParameter("user");
		try{
			CommentService commentService = serviceManager.getCommentService();
			userInfo.setUser(article_user);
			userInfo.setPath(article_randomStr);
			System.out.println("in ViewTopicAction..userInfo :"+userInfo);
			commentService.getComments(userInfo);
			
		//	String fn = userInfo.getBasePath()+article_user+File.separator+article_randomStr+File.separator+"topic.txt";
      
		}catch(Exception e)
		{
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}

}
