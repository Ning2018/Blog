package action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Random;

import entity.Article;
import service.ArticleService;

public class PostArticleAction extends BaseAction {

	public String execute() throws Exception
	{
		try{
			ArticleService articleService = serviceManager.getArticleService();
			userInfo.setContent(request.getParameter("content"));
			userInfo.setTitle(request.getParameter("title"));
			articleService.addArticle(userInfo,servletContext);
			
		}catch(Exception e){
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}

}
