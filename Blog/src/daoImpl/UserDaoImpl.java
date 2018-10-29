package daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.BaseDao;
import dao.UserDAO;
import entity.User;

public class UserDaoImpl extends BaseDao implements UserDAO {

	@Override
	public void addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		
		try {
			System.out.println("in UserDaoImpl..addUser "+user);
			session = getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			transaction.rollback();
		}finally{
			session.close();
		}
	}

	@Override
	public User load(String username) {
		// TODO Auto-generated method stub
		Session session= null;
		
		try {
			session = getSessionFactory().openSession();
			Query query = session.createQuery("from User u WHERE u.username = '" + username + "'");
			List<User> list = query.list();
			if (list.size() > 0)
				return list.get(0);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			session.close();
		}
		return null;
	}

	@Override
	public boolean exists(User user) {
		// TODO Auto-generated method stub
		if(load(user.getUsername())==null)
		{
			return false;
		}
		return true;
	}

	@Override
	public String getPasswordMD5(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		String hql= "Select password from User user WHERE user.username = '"+user.getUsername()+"'";
		
		try {
			session = getSessionFactory().openSession();
			List<String> list = session.createQuery(hql).list();
			if (list.size() > 0)
				return list.get(0);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			session.close();
		}
			return null;
	}

}
