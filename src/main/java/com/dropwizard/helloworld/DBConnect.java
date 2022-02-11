package com.dropwizard.helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBConnect {


	public DBConnect() {
		this.connectWeapons();
	}


 	public List<Object> connectGods() {
		List<Object> gods = new ArrayList<>();
		
	try {
		//Get connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newDatabase","root","eggroll94");
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRs = myStmt.executeQuery("select * from Gods");
		//Process ResultSet
		while(myRs.next()) {
			//create new god object
			Gods god = new Gods();
			//add god's details from result set
			god.name = myRs.getString("godName");
			god.description = myRs.getString("godDescription");
			god.damage = myRs.getInt(("Damage"));
			//add god to list
			gods.add(god);
			
			}
		myConn.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return gods;
	}
	public List<Object> connectSpells() {

		List<Object> spells = new ArrayList<>();
		
	try {
		//Get connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newDatabase","root","eggroll94");
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRs = myStmt.executeQuery("select * from spells");
		
		//Process ResultSet
		while(myRs.next()) {
			//create new spell object
			Spells spell = new Spells();
			//add spell's details from result set
			spell.name = myRs.getString("name");
			spell.damage = myRs.getInt("damage");
			//add spell to list
			spells.add(spell);
			
			}
		myConn.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return spells;
	}
	public List<Object> connectWeapons() {
		List <Object> weapons = new ArrayList<>();
	try {
		//Get connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newDatabase","root","eggroll94");
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRs = myStmt.executeQuery("select * from weapons");
		
		//Process ResultSet
		while(myRs.next()) {
			//create new weapons object
			Weapons weapon = new Weapons();
			//add weapon's details from result set
			weapon.name = myRs.getString("name");
			weapon.damage = myRs.getInt("damage");
			//add weapon to list
			weapons.add(weapon);
			
			}
		myConn.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	return weapons;

	}	
	public List<Object> connectArmor() {

		List<Object> armour = new ArrayList<>();
		
	try {
		//Get connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newDatabase","root","eggroll94");
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRs = myStmt.executeQuery("select * from armor");
		
		//Process ResultSet
		while(myRs.next()) {
			//create new armor object
			Armor armor = new Armor();
			//add Armor's details from result set
			armor.name = myRs.getString("name");
			armor.defense = myRs.getInt("defense");
			//add armor to list
			armour.add(armor);
			
			}
		myConn.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return armour;
	}	
	public List<Object> connectCompanions() {
		List<Object> companions = new ArrayList<>();
		
	try {
		//Get connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newDatabase","root","eggroll94");
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRs = myStmt.executeQuery("select * from companions");
		
		//Process ResultSet
		while(myRs.next()) {
			//create new companion object
			Companions companion = new Companions();
			//add companion's details from result set
			companion.name = myRs.getString("name");
			companion.damage = myRs.getInt("damage");
			companion.health = myRs.getInt("health");
			//add companion to list
			companions.add(companion);
			
			}
		myConn.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return companions;
	}
	public List<Object> connectLocations() {
		List<Object> locations = new ArrayList<>();
		
	try {
		//Get connection to database
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newDatabase","root","eggroll94");
		Statement myStmt = myConn.createStatement();
		//Execute SQL Query
		ResultSet myRs = myStmt.executeQuery("select * from locations");
		
		//Process ResultSet
		while(myRs.next()) {
			//create new location object
			Locations location = new Locations();
			//add location's details from result set
			location.name = myRs.getString("name");
			location.id = myRs.getInt("idLocation");
			//add god to list
			locations.add(location);
			
			}
		myConn.close();
		}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return locations;
	}



}


	

 


