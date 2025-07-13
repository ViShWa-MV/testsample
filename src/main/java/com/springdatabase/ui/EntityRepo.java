package com.springdatabase.ui;

import org.springframework.data.jpa.repository.JpaRepository;


interface  EntityRepo extends JpaRepository<LoginEntity, Integer>{

}
