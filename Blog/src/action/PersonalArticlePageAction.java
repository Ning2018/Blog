package action;

import service.ArticleService;

public class PersonalArticlePageAction extends BaseAction {
	
	public String execute() throws Exception

	{
		String s=request.getParameter("page");
		try{
		ArticleService articleService = serviceManager.getArticleService();
		userInfo.setSelect(request.getParameter("select"));
		if(s!=null){
			userInfo.setPage(Integer.parseInt(s));
		}
		userInfo.setArticles(articleService.getPersonalArticles(userInfo));
			
		}catch(Exception e){
			System.out.println(e);
			return ERROR;
		}
		return SUCCESS;
	}


}
