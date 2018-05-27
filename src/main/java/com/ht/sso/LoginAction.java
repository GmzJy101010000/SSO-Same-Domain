package com.ht.sso;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

   private String username;
   private String password;
   private String gotoURL;


	
	public String doLogin(){
		
		if(username.equals("zgm") &&password.equals("123")){
            Cookie cookie=new Cookie("zgm", "123");	
            cookie.setPath("/");
         
            HttpServletResponse res=ServletActionContext.getResponse();
			res.addCookie(cookie);
			//gotoURL="/su.jsp";
			return "success";
		
		}
		return "login";
	}
	public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getGotoURL() {
	return gotoURL;
}
public void setGotoURL(String gotoURL) {
	this.gotoURL = gotoURL;
}
}
