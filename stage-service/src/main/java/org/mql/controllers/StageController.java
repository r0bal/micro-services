package org.mql.controllers;

import org.mql.models.Company;
import org.mql.models.StageCompany;
import org.mql.models.StagiaireCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/stages")
public class StageController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/company/{idCompany}")
	public StageCompany getStage(@PathVariable("idCompany") int idCompany){
		
		Company company = restTemplate.getForObject("http://company-service/company/"+idCompany, Company.class);
		
		StagiaireCompany stagiaireCompany = restTemplate.getForObject("http://stagiaire-service/stagiaire/company/"+idCompany, StagiaireCompany.class);
		
		return new StageCompany(company,stagiaireCompany.getStagiaires());
	}
	
}
