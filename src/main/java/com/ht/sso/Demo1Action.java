package com.ht.sso;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Demo1Action extends ActionSupport {
      private String gotoURL;
      
	public String home(){
    	  HttpServletRequest request=ServletActionContext.getRequest();
    	  Cookie[] cookies=request.getCookies();
    	  for(Cookie cookie:cookies){
    		  if(cookie.getName().equals("zgm")&&cookie.getValue().equals("123")){
    			  return "success";
    		  }
    	  }
    	   gotoURL="/demo1/home.action"; 
    	  return "login";
      }
	
	public String getGotoURL() {
		return gotoURL;
	}
	public void setGotoURL(String gotoURL) {
		this.gotoURL = gotoURL;
	}
}
