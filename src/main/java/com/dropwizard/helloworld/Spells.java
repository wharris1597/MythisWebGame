package com.dropwizard.helloworld;

public class Spells {
	String name;
	int id;
	int damage;
	@Override
	public String toString() {
		return "\nSpell: [name=" + name + ", id=" + id + ", damage=" + damage + "]";
	}
	

}
