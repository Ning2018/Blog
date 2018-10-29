package serviceImpl;

import common.UserInfo;
import dao.UserDAO;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		if(userDao.exists(user)){
			throw new Exception("<"+user.getEmail()+">ÒÑ¾­´æÔÚ£¡");
		}
		userDao.addUser(user);
	}

	@Override
	public boolean verifyUser(User user) {
		// TODO Auto-generated method stub
		if(user.getPassword().equals(userDao.getPasswordMD5(user)))
			return true;
		else
		return false;
	}


}
