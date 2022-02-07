package com.dropwizard.helloworld;

public class Companions {
	String name;
	int damage;
	int health;
	@Override
	public String toString() {
		return "\nCompanion: [name=" + name + ", damage=" + damage + ", health=" + health + "]";
	}
	

}
