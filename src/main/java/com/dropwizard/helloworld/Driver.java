package com.dropwizard.helloworld;

import java.sql.SQLException;
import java.util.Random;

public class Driver {

	public static void main(String[] args) throws SQLException {
		//Print welcome message
		System.out.println("Hello!");
		
		//access new player instance
		Locations newLocation = new Locations();
		newLocation = (Locations) Locations.getLocations().get(1);



		Player.getPlayerInstance().battle((Gods) Gods.getGods().get(0));

		System.out.print(Player.getPlayerInstance());























		//System.out.println(newPlayer);

		//create new connection object
		


	}

}
