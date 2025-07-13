package com.springdatabase.signup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface Signuprepo extends JpaRepository <SignupEntity,Integer>
{
	SignupEntity findByEmailid(String emailid);

}