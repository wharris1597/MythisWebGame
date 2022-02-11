package com.dropwizard.helloworld;

import java.util.*;
public class Player {
	//variables
	private static Player player;
	private Locations location;
	private Armor armor;
	private Weapons weapon = Weapons.assignWeapon();
	private Companions companion;
	private int health = 100;
	private int magicLvl = 0;

	//default constructor for new player
	private Player() {
		this.armor = Armor.assignArmor();
		setLocation("Athens");

		//make player's magic level 25 if weapon is grimoire
		if(Objects.equals(this.weapon.name, "Grimoire")){
			this.magicLvl = 25;

		}


		//System.out.println(this);
	}
	//create singleton pattern to prevent multiple player isntances at a time
	public static Player getPlayerInstance(){
		//search for instance of player, if not found, create one and return it
		if(player == null){
			System.out.println("Creating new Player");
			player = new Player();
		}

		//if health falls to 0 or below, display game over
		//FIXME delete player instance? reset?
		if(player.health<=0){
			System.out.println("You have died. You are dead...that means game over");
			System.out.println("Here are your final Stats:");
			System.out.println("");


		}
		return player;
	}

	
	//METHODS

	
	//Introduce self
	//Attack Move
	//Travel method
	//assign weapon

	//setter for Location
	public void setLocation(String newLoc) {
		switch(newLoc){
			case "Athens": location = (Locations) Locations.getLocations().get(0); break;
			case "Crete": location = (Locations) Locations.getLocations().get(1); break;
			case "Underworld": location = (Locations) Locations.getLocations().get(2); break;
			case "Hecate Temple": location = (Locations) Locations.getLocations().get(3); break;
			case "Medusa's Cave": location = (Locations) Locations.getLocations().get(4); break;
			case "Olympus": location = (Locations) Locations.getLocations().get(5); break;
		}
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
	public Locations getLocation() {
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

	public void battle(Gods god){
		player.health = player.health - god.damage;

	}


	@Override
	public String toString() {
		return "Player Info:" + location +
				"\n" + armor +
				"\n" + weapon +
				"\ncompanion=" + companion +
				"\nhealth=" + health +
				"\nmagicLvl=" + magicLvl;
	}
}
