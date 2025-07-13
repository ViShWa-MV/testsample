package com.springdatabase;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<StudentEntity, Integer>{

	 StudentEntity findByRollno(int rollno);

	
	

}
