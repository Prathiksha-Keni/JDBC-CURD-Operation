package com.xworkz.airport.dao;

public class AirportTester {

	public static void main(String[] args) {
		AirportDaoImpl airport = new AirportDaoImpl();
		airport.insertEntity();
		airport.updateEntity();
		airport.readEntity();
		airport.readAllEntity();
		airport.deleteEntity();
		airport.readAllEntity();


	}

}
