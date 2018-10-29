package service;

import java.util.List;

import javax.servlet.ServletContext;

import common.UserInfo;
import entity.Article;

public interface ArticleService {
	
	public void addArticle(UserInfo userInfo, ServletContext servletContext) throws Exception;
	public List<Article> getArticles(UserInfo userInfo);
	public List<Article> getPersonalArticles(UserInfo userInfo);
	public void deleteArticle(Integer id);

}
