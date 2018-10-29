package dao;

import java.util.List;

import common.UserInfo;
import entity.Article;

public interface ArticleDao {
	
	public void addArticle(Article article);
	public void update(Article article);
	public void execute(String hql, Object...params);
	public List<Article> getArticles(String hql, Object...params);
	public List<Article> getArticles1(String hql, int firstRow, int maxRow, Object...params);

	public void deleteArticle(Integer id);
}
