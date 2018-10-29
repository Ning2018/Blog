package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import dao.BaseDao;
import dao.CommentDao;
import entity.Comment;

public class CommentDaoImpl extends BaseDao implements CommentDao {

	@Override
	public void addComment(Comment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Comment> getComments(String hql, Object... params) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = getSessionFactory().openSession();
			Query query = session.createQuery(hql);
			for(int i=0; i<params.length;i++){
				query.setParameter(i, params[i]);
			}
			List<Comment> list = query.list();
			if(list.size()>0)
				return query.list();
			else return null;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}finally{
			session.close();
		}
		
	}
	
}
