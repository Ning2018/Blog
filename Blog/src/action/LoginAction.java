package action;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ModelDriven;

import entity.User;
import service.UserService;

public class LoginAction extends BaseAction implements ModelDriven<User> {
	
	User user = new User();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String execute() throws Exception
	{
		try {
			UserService userService = serviceManager.getUserService();
			if (userService.verifyUser(user)) {
				saveCookie("user", user.getUsername(), 24 * 60 * 60);
				
				HttpSession session = request.getSession();  //用户浏览器与服务器之间建立会话
				session.setAttribute("username", user.getUsername());
				session.setMaxInactiveInterval(60*60*3);
			}
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ERROR;
		
	}

}
