package com.springdatabase;

import java.util.List;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdatabase.ui.LoginEntity;

import jakarta.persistence.Entity;



@Controller 
@RequestMapping("/ui")
public class StudentController {
	  @Autowired
	  private Studentrepo studentRepository;
	 
		/*
		 * @GetMapping("/home") public String display() { return "new"; }
		 */
	@GetMapping("/submit")
	public String getinput(@RequestParam("name") String name,@RequestParam("regno") int regno,@RequestParam("dept") String dept,@RequestParam("fathername") String fathername,@RequestParam("mothername") String mothername,@RequestParam("cgpa") String cgpa,@RequestParam("address") String address,@RequestParam("phonenumber") String phonenumber,Model model )
	{ 
		String result="Details added sucessfully";
		StudentEntity st=new StudentEntity( name,  dept,  regno, fathername, mothername,  cgpa,
				 phonenumber,  address);
		
		studentRepository.save(st);
		System.out.println( result);
		
		return "jsp/submitted";
	}
	// Controller method
	@PostMapping("/submittedlist")
	public String viewStudents(Model model) {
    List<StudentEntity> students = studentRepository.findAll();
    model.addAttribute("students", students);
    
	    return "jsp/submittedlist"; 
	}
	@PostMapping("/deletelist")
	public String delete()
	{
		
		return "jsp/delete";
	}

	
	  @PostMapping("/deletebyid") public String delete1(@RequestParam("rollno") int rollno,Model model)
	  { 
		  StudentEntity stu=studentRepository.findByRollno(rollno); 
	  if(stu!=null )  
	  {  
		  studentRepository.delete(stu);
		
		  return "jsp/delete1";
	  
	  } 
	  model.addAttribute("msg", "Student not found..");
	  return "jsp/delete2";
	  
	  
	  }
	  @PostMapping("/update")
	  public String update()
	  {
		  return "jsp/update";
		  
	  }
	  @PostMapping("/update1")
	  public String update1(@RequestParam("rollno")int rollno)
	  {
		  StudentEntity stu=studentRepository.findByRollno(rollno); 
		  if(stu!=null )  
		  { 
			  
			  return "jsp/new1";
		  }
		  
		  return "jsp/update1";
		  
	  }
	  @PostMapping("/update2")
	  public String update2(@RequestParam("rollno") int rollno,@RequestParam("name") String name,@RequestParam("regno") int regno,@RequestParam("dept") String dept,@RequestParam("fathername") String fathername,@RequestParam("mothername") String mothername,@RequestParam("cgpa") String cgpa,@RequestParam("address") String address,@RequestParam("phonenumber") String phonenumber,Model model )
	  {
		  StudentEntity st=new StudentEntity( rollno,name,  dept,  regno, fathername, mothername,  cgpa,
					 phonenumber,  address); 
		  studentRepository.save(st);
		  
		  return "jsp/home";
		  
	  }
	  
	 
	 @RequestMapping("/{viewName}")
	    public String forwardToView(@PathVariable String viewName) {
	        return viewName; // resolves to /WEB-INF/views/{viewName}.jsp
	    }
	

}
