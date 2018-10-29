package action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

import common.UserInfo;
import serviceImpl.ServiceManager;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware {
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected UserInfo userInfo;
	protected Map<String,String> cookies;
	protected ServletContext servletContext;
	protected ServiceManager serviceManager;


	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		this.servletContext=arg0;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response=arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
		userInfo.setCookieUser(getCookieValue("user"));
	}

	private String getCookieValue(String name) {
		// TODO Auto-generated method stub
		Cookie cookies[] = request.getCookies();
		if(cookies!=null){
			for(Cookie cookie: cookies){
				if(!cookie.getName().equals(name))
					continue;
				return cookie.getValue();
			}
		}
		return null;
	}

	protected void saveCookie(String name, String value, int maxAge)
	{
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(maxAge);
		cookie.setPath(servletContext.getContextPath());
		System.out.println("in BaseAction, cookie.setPath "+servletContext.getContextPath());
		response.addCookie(cookie);
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public void setServiceManager(ServiceManager serviceManager) {
		this.serviceManager = serviceManager;
	}
	
	

}
