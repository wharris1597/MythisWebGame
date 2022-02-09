package com.dropwizard.helloworld;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws SQLException {
		//Print welcome message
		System.out.println("Hello!");
		
		//access new player instance
		Locations newLocation = new Locations();
		newLocation = (Locations) Locations.getLocations().get(1);



		Player.getPlayerInstance().setLocation("Olympus");
		System.out.println(Player.getPlayerInstance());




















		//System.out.println(newPlayer);

		//create new connection object
		


	}

}
