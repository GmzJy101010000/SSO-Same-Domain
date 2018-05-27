package com.ssga.sso;

import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Demo2Action extends ActionSupport {
      private String gotoURL;
      
	public String home(){
    	  HttpServletRequest request=ServletActionContext.getRequest();
    	  Cookie[] cookies=request.getCookies();
    	  for(Cookie cookie:cookies){
    		  if(cookie.getName().equals("zgm")&&cookie.getValue().equals("123")){
    			  return "success";
    		  }
    	  }
    	   gotoURL="/demo2/home.action"; 
    	  return "login";
    	  
      }
	
	public String getGotoURL() {
		return gotoURL;
	}
	public void setGotoURL(String gotoURL) {
		this.gotoURL = gotoURL;
	}
}
