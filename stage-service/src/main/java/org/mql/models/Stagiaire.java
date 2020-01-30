package org.mql.models;

public class Stagiaire{

	private int id;
	private String lastname;
	private String firstname;
	private int company;

	public Stagiaire() {
	}

	public Stagiaire(String lastname, String firstname, int company) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getCompany() {
		return company;
	}

	public void setCompany(int company) {
		this.company = company;
	}

}
