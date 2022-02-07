package com.dropwizard.helloworld;

import java.util.*;
public class Player {
	//variables
	private static Player player;
	private String location = "Athens";
	private Armor armor = Armor.assignArmor();
	private Weapons weapon = Weapons.assignWeapon();
	private Companions companion;
	private int health = 100;
	private int magicLvl = 0;


	//create singleton pattern to prevent multiple player isntances at a time
	public static Player getPlayerInstance(){
		//search for instance of player, if not found, create one and return it
		if(player == null){
			System.out.println("Creating new Player");
			player = new Player();
		}
		else {
			System.out.println(player);
		}
		return player;
	}
	//default constructor for new player
	private Player() {

		//make player's magic level 25 if weapon is grimoire
		if(Objects.equals(this.weapon.name, "Grimoire")){
			this.magicLvl = 25;
		}

		System.out.println(this);
	}
	
	//METHODS

	
	//Introduce self
	//Attack Move
	//Travel method
	//assign weapon

	public void travel() {
		System.out.println("You are currently located at: "+ location);
		System.out.println("Would you like to travel? y or n");
		//create new scanner object
		Scanner scnr = new Scanner(System.in);
		String answer = scnr.nextLine();
		if (answer.equals("y")) {
			System.out.println("Where would you like to travel?");
			String destination = scnr.nextLine();
			System.out.println("Traveling to "+ destination);
			
		}
		
		
		
		
	}
	//List Stats
	public void listStats() {
		System.out.println("Here are your Stats:");
		System.out.println("Health: " + health);
		System.out.println("Magic Lvl: " + magicLvl);

	}


	@Override
	public String toString() {
		return "Player Info:" +
				"\nlocation='" + location + '\'' +
				"\n" + armor +
				"\n" + weapon +
				"\ncompanion=" + companion +
				"\nhealth=" + health +
				"\nmagicLvl=" + magicLvl;
	}
}
