package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import common.UserInfo;
import dao.ArticleDao;
import dao.BaseDao;
import entity.Article;

public class ArticleDaoImpl extends BaseDao implements ArticleDao {

	@Override
	public void addArticle(Article article) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(article);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}finally{
			session.close();
		}
	}

	@Override
	public void update(Article article) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.update(article);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}finally{
			session.close();
		}
	}

	@Override
	public List<Article> getArticles(String hql, Object... params) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory().openSession();
			Query query = session.createQuery(hql);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			return query.list();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public List<Article> getArticles1(String hql, int firstRow, int maxRow, Object... params) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory().openSession();
			Query query = session.createQuery(hql);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			query.setFirstResult(firstRow);
			query.setMaxResults(maxRow);
			return query.list();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally{
			session.close();
		}
	}

	@Override
	public void execute(String hql, Object... params) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory().openSession();
			Query query = session.createQuery(hql);
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
			query.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}finally{
			session.close();
		}
	}

	@Override
	public void deleteArticle(Integer id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		Article article = new Article();
		article.setId(id);
		try {
			session = getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.delete(article);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally
		{
			session.close();
		}
	}

}
