package serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletContext;

import common.UserInfo;
import dao.ArticleDao;
import dao.UserDAO;
import entity.Article;
import entity.User;
import service.ArticleService;

public class ArticleServiceImpl implements ArticleService {

	private ArticleDao articleDao;
	private UserDAO userDao;

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addArticle(UserInfo userInfo, ServletContext servletContext) throws Exception {
		// TODO Auto-generated method stub

		User user = userDao.load(userInfo.getCookieUser());
		if (user == null)
			return;
		Random random = new Random();
		String randomStr = String.valueOf(random.nextInt(Integer.MAX_VALUE));
		String fn = servletContext.getRealPath("/") + "Topic" + File.separator + userInfo.getCookieUser()
				+ File.separator + randomStr;
		System.out.println("in PostArticle Action, " + fn);
		File dir = new File(fn);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		fn += File.separator + "topic.txt";

		// userInfo.setPath(fn); // for a
		// href="post_article.action?path=userInfo.path"

		OutputStream os = new FileOutputStream(fn);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(userInfo.getContent());
		osw.close();
		os.close();

		Date date = new Date();
		Article article = new Article();
		article.setArticlePath(randomStr);
		article.setPostArticleTime(date);
		article.setTitle(userInfo.getTitle());
		article.setUser(user);
		article.setLastReplyUser(user);
		article.setLastReplyTime(date);
		article.setLastEditTime(date);
		System.out.println("in ArticleService..addArticle," + article);
		articleDao.addArticle(article);
	}

	@Override
	public List<Article> getArticles(UserInfo userInfo) {
		// TODO Auto-generated method stub
		int totalPage = 1;

		if (userInfo.getSelect() != null && !userInfo.getSelect().equals("")) {
			totalPage = getPageNumber(userInfo.getArticlesNumberPerPage(), userInfo.getSelect());
		} else
			totalPage = getPageNumber(userInfo.getArticlesNumberPerPage(), null);
		userInfo.setTotalPage(totalPage);
		if (userInfo.getPage() > totalPage) {
			userInfo.setPage(totalPage);
		}
		if (userInfo.getPage() < 1) {
			userInfo.setPage(1);
		}
		System.out.println("in ArticleServiceImpl, userInfo.getPage()," + userInfo.getPage());
		String hql = "from Article a order by a.lastReplyTime desc";
		String hqlselect = "from Article a where a.title like ? order by a.lastReplyTime desc";
		List<Article> articles = null;
		if (userInfo.getSelect() != null && userInfo.getSelect() != "") {

			articles = articleDao.getArticles1(hqlselect,
					(userInfo.getPage() - 1) * userInfo.getArticlesNumberPerPage(), userInfo.getArticlesNumberPerPage(),
					"%" + userInfo.getSelect() + "%");
		} else {
			articles = articleDao.getArticles1(hql, (userInfo.getPage() - 1) * userInfo.getArticlesNumberPerPage(),
					userInfo.getArticlesNumberPerPage());
		}

		return articles;
	}

	private int getPageNumber(int articlesNumberPerPage, String select) {
		// TODO Auto-generated method stub
		int count = 0;
		if (select == null) {
			count = articleDao.getArticles("from Article").size();
		} else
			count = articleDao.getArticles("from Article a where a.title like ?", "%" + select + "%").size();
		int pageNumber = 1;
		if (count > 0) {
			if (count % articlesNumberPerPage != 0)
				pageNumber = count / articlesNumberPerPage + 1;
		}
		return pageNumber;
	}

	private int getPageNumberPersonal(int articlesNumberPerPage, String cookieUser, String select) {
		// TODO Auto-generated method stub
		int count = 0;
		if (select == null) {
			count = articleDao.getArticles("from Article a where a.user.username=?", cookieUser).size();
		} else
			count = articleDao.getArticles("from Article a where a.user.username=? and a.title like ?", cookieUser,
					"%" + select + "%").size();
		int pageNumber = 1;
		if (count > 0) {
			if (count % articlesNumberPerPage != 0)
				pageNumber = count / articlesNumberPerPage + 1;
		}
		return pageNumber;
	}

	@Override
	public List<Article> getPersonalArticles(UserInfo userInfo) {
		// TODO Auto-generated method stub
		int totalPage = 1;

		if (userInfo.getSelect() != null && !userInfo.getSelect().equals("")) {
			totalPage = getPageNumberPersonal(userInfo.getArticlesNumberPerPage(), userInfo.getCookieUser(),
					userInfo.getSelect());
		} else
			totalPage = getPageNumberPersonal(userInfo.getArticlesNumberPerPage(), userInfo.getCookieUser(), null);
		userInfo.setTotalPage(totalPage);
		if (userInfo.getPage() > totalPage) {
			userInfo.setPage(totalPage);
		}
		if (userInfo.getPage() < 1) {
			userInfo.setPage(1);
		}

		String hql = "from Article a WHERE a.user.username = ?";
		List<Article> articles = null;

		articles = articleDao.getArticles1(hql, (userInfo.getPage() - 1) * userInfo.getArticlesNumberPerPage(),
				userInfo.getArticlesNumberPerPage(), userInfo.getCookieUser());

		if (articles.size() > 0) {
			return articles;
		}
		return null;
	}

	@Override
	public void deleteArticle(Integer id) {
		try {
			// TODO Auto-generated method stub
			articleDao.deleteArticle(id);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}



}
