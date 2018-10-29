package action;

import service.ArticleService;

public class DeleteArticleAction extends BaseAction {
	
	public String execute() throws Exception
	{
		
		
		try {
			ArticleService articleService = serviceManager.getArticleService();
			articleService.deleteArticle(Integer.parseInt(request.getParameter("article_id")));
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ERROR;
		
	}

}
