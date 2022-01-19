package com.xworkz.Airport.DAO;

public class AirportTester {

	public static void main(String[] args) {
		AirportDaoImpl airport = new AirportDaoImpl();
		airport.InsertEntity();
		airport.UpdateEntity();
		airport.ReadEntity();
		airport.ReadAllEntity();
		airport.DeleteEntity();
		airport.ReadAllEntity();


	}

}
