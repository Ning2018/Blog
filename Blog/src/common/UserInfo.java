package common;

import java.util.List;

import entity.Article;

public class UserInfo {

	private String cookieUser;
	private String title;
	private String content;
	private String select;
	
	private String user;
	private String path;  //randomStr
	private Article article;  //userInfo.getArticle() ÓÃ»§É¾³ýÎÄÕÂ
	private String articleURL;
	private int page;  //current Page 
	private int totalPage;
	private int articlesNumberPerPage;
	private List<Article> articles;
	private String basePath;
	
	public String getCookieUser() {
		return cookieUser;
	}

	public void setCookieUser(String cookieUser) {
		this.cookieUser = cookieUser;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getArticlesNumberPerPage() {
		return articlesNumberPerPage;
	}

	public void setArticlesNumberPerPage(int articlesNumberPerPage) {
		this.articlesNumberPerPage = articlesNumberPerPage;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public String getArticleURL() {
		return articleURL;
	}

	public void setArticleURL(String articleURL) {
		this.articleURL = articleURL;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "UserInfo [cookieUser=" + cookieUser + ", title=" + title + ", content=" + content + ", select=" + select
				+ ", user=" + user + ", path=" + path + ", article=" + article + ", articleURL=" + articleURL
				+ ", page=" + page + ", totalPage=" + totalPage + ", articlesNumberPerPage=" + articlesNumberPerPage
				+ ", articles=" + articles + ", basePath=" + basePath + "]";
	}

	
	
}
