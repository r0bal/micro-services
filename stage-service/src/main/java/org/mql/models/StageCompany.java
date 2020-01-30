package org.mql.models;

import java.util.List;

public class StageCompany {

	private Company company;
	private List<Stagiaire> stagiaires;

	public StageCompany() {

	}

	public StageCompany(Company company, List<Stagiaire> stagiaires) {
		super();
		this.company = company;
		this.stagiaires = stagiaires;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Stagiaire> getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(List<Stagiaire> stagiaires) {
		this.stagiaires = stagiaires;
	}

}
