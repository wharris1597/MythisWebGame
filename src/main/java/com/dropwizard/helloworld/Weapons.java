package com.dropwizard.helloworld;

import java.util.List;
import java.util.Random;
public class Weapons {
	String name;
	int damage;

	public Weapons(){
		this.name = "";
		this.damage = 0;

	}

	public static List<Object> getWeapons(){
		return (List<Object>) PopulateLists.getList("weapons");
	}

	//static method to assign random weapon to player
	public static Weapons assignWeapon(){
		List <Object> weaponsList = getWeapons();
		//create random object
		Random rand = new Random();
		//pass weapons list into random object
		return (Weapons) weaponsList.get(rand.nextInt(weaponsList.size()));
	}




	@Override
	public String toString() {
		return "Weapon: [name=" + name + ", damage=" + damage + "]";
	}

	public List<Object> toString(String var) {
		List <Object> weaponsList = getWeapons();
		return weaponsList;
	}
}
