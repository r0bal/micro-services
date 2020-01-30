package org.mql.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stagiaire")
public class StagiaireController {

	@Autowired
	private StagiaireRepository repository;
	
	@RequestMapping("/")
	public List<Stagiaire> getAllStagiaires(){
		return repository.findAll();
	}
	
	@RequestMapping("/{id}")
	public Stagiaire getStagiaireById(@PathVariable("id") int id) {
		Stagiaire stagiaire = repository.findById(id).get();
		return stagiaire;
	}
	
	@RequestMapping("/add")
	public void addStagiaire(Stagiaire stagiaire) {
		repository.save(stagiaire);
	}
	
	@RequestMapping("/update")
	public void updateStagiaire(Stagiaire stagiaire) {
		repository.save(stagiaire);
	}
	
	@RequestMapping("/delete/{id}")
	public void updateStagiaire(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	@RequestMapping("/company/{id}")
	public StagiaireCompany getStagiaireByCompany(@PathVariable("id") int idCompany){
		List<Stagiaire> stagiaires = repository.findStagiaireByCompanyId(idCompany);
		StagiaireCompany stagiaireCompany = new StagiaireCompany();
		stagiaireCompany.setStagiaires(stagiaires);
		return stagiaireCompany;
	}
}
