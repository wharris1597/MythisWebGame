package com.dropwizard.helloworld;

import java.util.*;
public class Player {
	//variables
	private static Player player;
	private String location = "Athens";
	private Armor armor;
	private Weapons weapon = Weapons.assignWeapon();
	private Companions companion;
	private int health = 100;
	private int magicLvl = 0;

	//default constructor for new player
	private Player() {
		this.armor = Armor.assignArmor();

		//make player's magic level 25 if weapon is grimoire
		if(Objects.equals(this.weapon.name, "Grimoire")){
			this.magicLvl = 25;
		}

		System.out.println(this);
	}
	//create singleton pattern to prevent multiple player isntances at a time
	public static Player getPlayerInstance(){
		//search for instance of player, if not found, create one and return it
		if(player == null){
			System.out.println("Creating new Player");
			player = new Player();
		}
		return player;
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

		
		
		
		
	}
	//List Stats
	public void listStats() {
		System.out.println("Here are your Stats:");
		System.out.println("Health: " + health);
		System.out.println("Magic Lvl: " + magicLvl);

	}


	//getter methods
	public Armor getArmor(){
		return player.armor;
	}
	public String getLocation() {
		return location;
	}
	public Weapons getWeapon() {
		return weapon;
	}
	public Companions getCompanion() {
		return companion;
	}
	public int getHealth() {
		return health;
	}
	public int getMagicLvl() {
		return magicLvl;
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
