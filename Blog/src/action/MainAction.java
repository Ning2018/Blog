package action;

import service.ArticleService;

public class MainAction extends BaseAction {

	public String execute() throws Exception

	{
		String s=request.getParameter("page");
		try{
		ArticleService articleService = serviceManager.getArticleService();
		userInfo.setSelect(request.getParameter("select"));
		if(s!=null){
			userInfo.setPage(Integer.parseInt(s));
		}
	
		userInfo.setArticles(articleService.getArticles(userInfo));
			
		}catch(Exception e){
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}

}
