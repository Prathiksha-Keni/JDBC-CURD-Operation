package com.xworkz.company.dao;

public class CompanyTester {

	public static void main(String[] args) {
		CompanyDaoImpl company = new CompanyDaoImpl();
		company.insertEntity();
		company.updateEntity();
		company.readEntity();
		company.readAllEntity();
		company.deleteEntity();
		company.readAllEntity();
	}
}
