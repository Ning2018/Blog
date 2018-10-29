package serviceImpl;

import java.io.File;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import common.UserInfo;
import dao.ArticleDao;
import dao.CommentDao;
import dao.UserDAO;
import entity.Article;
import entity.Comment;
import service.CommentService;

public class CommentServiceImpl implements CommentService {

	private CommentDao commentDao;
	private UserDAO userDao;
	private ArticleDao articleDao;
	
	
	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public void getComments(UserInfo userInfo) {
		List<Article> list=null;
		try {
			// TODO Auto-generated method stub
			String hql = "from Article a where a.user.username =? and a.articlePath=?";
			list = articleDao.getArticles(hql, userInfo.getUser(), userInfo.getPath());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		Article article = list.get(0);
		System.out.println("in CommentService..getComments"+article);
		article.setViewCount(article.getViewCount()+1);
		articleDao.update(article);
		
		String articleURL = userInfo.getBasePath()+userInfo.getUser()+File.separator+userInfo.getPath()+File.separator+"topic.txt";
		userInfo.setArticleURL(articleURL);
		
		userInfo.setArticle(article);
	}

	@Override
	public void addComment(UserInfo userInfo) throws Exception {
		// TODO Auto-generated method stub

	}

}
