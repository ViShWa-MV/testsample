package com.springdatabase.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/si")
public class SignupController {

    @Autowired
    private Signuprepo signuprepo;

    @GetMapping("/signup")
    public String display(Model model, @RequestParam(value = "error", required = false) String error) {
        
        return "signup"; 
    }
    @GetMapping("/login")
    public String nav()
    {
    	return "login";
    }

    @GetMapping("/signin")
    public String signin(
            @RequestParam("firstname") String firstname,
            @RequestParam("lastname") String lastname,
            @RequestParam("emailid") String emailid,
            @RequestParam("password") String password,
            @RequestParam("gender") String gender , RedirectAttributes redirectAttributes) {

       
        SignupEntity su = new SignupEntity(firstname, lastname, emailid, password, gender);
       
        try {
            signuprepo.save(su);
        } catch (DataIntegrityViolationException e) {
            // Email already exists
        	  redirectAttributes.addFlashAttribute("error", "Email already registered!");
              return "redirect:/si/signup";  
        }

        return "login";
    }
    @PostMapping("/next")
    public String loging(@RequestParam("emailid") String emailid,@RequestParam("password") String password)
    {
    	  SignupEntity user = signuprepo.findByEmailid(emailid);

    	    if (user != null && user.getPassword().equals(password)) {
    	        // Credentials are correct
    	        return "home"; // Show success page
    	    } else {
    	        // Invalid login
    	        return "login"; // Or redirect to an error page
    	    }
    	
    }
    
}
