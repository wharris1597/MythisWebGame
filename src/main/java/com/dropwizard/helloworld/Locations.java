package com.dropwizard.helloworld;

import java.util.List;

public class Locations {
	public String name;
	int id;

	public Locations(){
		this.name = "";
		this.id = 100;
	}

	public static List<Object> getLocations(){
		return (List<Object>) PopulateLists.getList("locations");
	}
	
	@Override
	public String toString() {
		return "\nLocation: [name=" + name + ", id=" + id + "]";
	}

}
