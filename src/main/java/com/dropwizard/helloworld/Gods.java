package com.dropwizard.helloworld;

public class Gods {
	
	String name;
	String description;
	
	public Gods() {
		
	}


	public void attackGod(){
		Player player = Player.getPlayerInstance();
		System.out.println(player.getArmor());

	}
	
	

	@Override
	public String toString() {
		return "\nGod: [name=" + name + ", description=" + description + "]";
	}

	
}
	

