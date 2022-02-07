package com.dropwizard.helloworld;

public class Locations {
	String name;
	int id;
	
	
	@Override
	public String toString() {
		return "\nLocation: [name=" + name + ", id=" + id + "]";
	}

}
