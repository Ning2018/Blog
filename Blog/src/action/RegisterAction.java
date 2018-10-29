package action;

import com.opensymphony.xwork2.ModelDriven;

import entity.User;
import service.UserService;

public class RegisterAction extends BaseAction implements ModelDriven<User> {
	
	private User user ;
	
	public String execute() throws Exception{
		
		try {
			System.out.println("in RegisterAction.. "+user);
			UserService userService = serviceManager.getUserService();
			userService.addUser(user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ERROR;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		if(user==null)
			user = new User();
		return user;
	}

}
