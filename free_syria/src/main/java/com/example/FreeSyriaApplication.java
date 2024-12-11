package com.example;

import com.example.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FreeSyriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreeSyriaApplication.class, args);




	}
	@Autowired
	private PersonRepo personRepo;
}
