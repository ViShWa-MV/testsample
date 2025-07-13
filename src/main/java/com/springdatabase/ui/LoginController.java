package com.springdatabase.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdatabase.Studentrepo;

import jakarta.persistence.Entity;

@Controller 
@RequestMapping("/li")
public class LoginController {
	
	  @Autowired
	  private EntityRepo entityrepo;
	  @GetMapping("/login")
	  public String display() {
		  return "login";
	  }
	  @PostMapping("/logined")
	  public String login()
	  {
		  
		  return "new";
	  }
	  @GetMapping("/signup")
		public String nav()
		{
			return "signup";
		}
	  @RequestMapping("/{viewName}")
	    public String forwardToView(@PathVariable String viewName) {
	        return viewName; // resolves to /WEB-INF/views/{viewName}.jsp
	    }
}