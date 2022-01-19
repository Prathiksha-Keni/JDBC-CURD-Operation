package com.xworkz.Company.DAO;

public class CompanyTester {

	public static void main(String[] args) {
		CompanyDaoImpl company = new CompanyDaoImpl();
		company.InsertEntity();
		company.UpdateEntity();
		company.ReadEntity();
		company.ReadAllEntity();
		company.DeleteEntity();
		company.ReadAllEntity();
	}
}
