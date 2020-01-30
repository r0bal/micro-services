package org.mql;

import org.mql.models.Company;
import org.mql.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

public class CompanyServiceApplication implements CommandLineRunner {

	@Autowired
	private CompanyRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Company("CGI", "Fes"));
		repository.save(new Company("CGI", "Casablanca"));
		repository.save(new Company("CGI", "Rabat"));
		repository.save(new Company("UMANIS", "Casablanca"));
	}

}
