package org.mql.controllers;

import java.util.List;

import org.mql.models.Company;
import org.mql.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/company")
@RestController
public class CompanyController {
	
	@Autowired
	private CompanyRepository repository;
	
	@RequestMapping("/")
	public List<Company> getAllCompanies(){
		return repository.findAll();
	}
	
	@RequestMapping("/{id}")
	public Company getCompanyById(@PathVariable("id") int id) {
		System.out.println("C'est moi qui a servi : Company Service 2");
		return repository.findById(id).get();
	}
}
