package dao;

import common.UserInfo;
import entity.User;

public interface UserDAO {
	
	public void addUser(User user) throws Exception;
	public User load(String username);
	public boolean exists(User user);
    public String getPasswordMD5(User user);
}
