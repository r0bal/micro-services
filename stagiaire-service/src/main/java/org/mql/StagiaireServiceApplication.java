package org.mql;

import java.util.ArrayList;
import java.util.List;

import org.mql.models.Stagiaire;
import org.mql.models.StagiaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StagiaireServiceApplication implements CommandLineRunner {

	@Autowired
	private StagiaireRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(StagiaireServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Stagiaire> stagiaires = new ArrayList<>();
		stagiaires.add(new Stagiaire("BAGHDAD","Redouane",3));
		stagiaires.add(new Stagiaire("AZAROU","Amine",2));
		stagiaires.add(new Stagiaire("JAMAI","Hicham",3));
		for (Stagiaire stagiaire : stagiaires) {
			repository.save(stagiaire);
			System.out.println(stagiaire.getId());
		}
	}

	
}
