package com.example.execute.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringDataJpa22OracleRemoteApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpa22OracleRemoteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Customer>listCustomers=customerRepo.findAll();
		
		listCustomers.forEach(System.out::println);
		System.exit(0);
		
	}

}
