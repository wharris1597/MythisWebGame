package com.dropwizard.helloworld;

import java.util.List;
import java.util.Random;

public class Armor {
	int defense;
	String name;


	//pick up armor
	//list all armor sets
	public void listArmor(){

	}

	//method to get list of armor from populateLists class
	public static List<Object> getArmor(){
		return (List<Object>) PopulateLists.getList("armor");
	}

	//method to assign random armor set to player
	public static Armor assignArmor(){
		List<Object> armorList = getArmor();
		//create random object
		Random rand = new Random();
		//pass armor list into random object
		return (Armor) armorList.get(rand.nextInt(armorList.size()));
	}

	@Override
	public String toString() {
		return "Armor: [defense=" + defense + ", name=" + name + "]";
	}

}
