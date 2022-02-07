package com.dropwizard.helloworld;

import java.util.ArrayList;
import java.util.List;

public class PopulateLists {
	private final static DBConnect newConn = new DBConnect();

	//create lists of all object information to get from database
	private static final List<Object> spells = newConn.connectSpells();
	private static final List<Object> weapons = newConn.connectWeapons();
	private static final List<Object> armor = newConn.connectArmor();
	private static final List<Object> companions = newConn.connectCompanions();
	private static final List<Object> locations = newConn.connectLocations();
	private static final List<Object> gods = newConn.connectGods();




	
	public void populateLists() {



		
	}

	public static List getList(String listName){
		List<Object> list = new ArrayList<>();
		switch(listName){
			case "spells": list = spells; break;
			case "weapons": list = weapons; break;
			case "armor": list = armor; break;
			case "companions": list = companions; break;
			case "locations": list = locations; break;
			case "gods": list = gods; break;
		}
		return list;
	}


	@Override
	public String toString() {
		return "PopulateLists{" +
				"\nspells=" + spells +
				",\n weapons=" + weapons +
				",\n locations=" + locations +
				",\n companions=" + companions +
				",\n gods=" + gods +
				",\n armor=" + armor +
				'}';
	}
}
