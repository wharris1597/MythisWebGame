package com.dropwizard.helloworld;

import java.util.List;

public class Locations {
	String name;
	int id;

	public static List<Object> getLocations(){
		return (List<Object>) PopulateLists.getList("locations");
	}
	
	@Override
	public String toString() {
		return "\nLocation: [name=" + name + ", id=" + id + "]";
	}

}
