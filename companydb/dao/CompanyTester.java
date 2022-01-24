package com.xworkz.companydb.dao;

import java.util.Scanner;

import com.xworkz.companydb.companyentity.CompanyEntity;

public class CompanyTester {

	public static void main(String[] args) {

		CompanyDao company = new CompanyDaoImpl();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scanner.nextInt();

		System.out.println("Enter the name");
		String name = scanner.next();

		System.out.println("Enter the location");
		String loc = scanner.next();

		System.out.println("Enter is private");
		boolean ispvt = scanner.nextBoolean();

		System.out.println("Enter no of employee's");
		int noOfEmp = scanner.nextInt();

		System.out.println("Enter the grade");
		String grade = scanner.next();

		System.out.println("Enter no of Branches");
		int noOfBranches = scanner.nextInt();

		CompanyEntity entity = new CompanyEntity(id, name, loc, ispvt, noOfEmp, grade, noOfBranches);
		company.insertEntity(entity);
		//company.updateEntity(grade, id);
		//company.readEntity();
		//company.readAllEntity();
		//company.deleteEntity(id);
		scanner.close();

	}

}
