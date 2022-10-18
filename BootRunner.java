package com.xworkz.blacky.Boot;
import com.xworkz.blacky.Boat;

public class BootRunner {

	public static void main(String[] args) {
	
		Boat boat=new Boat("Titanic");
	    System.out.println(boat.name);
	    System.out.println(boat.color);
	    System.out.println(boat.companyName);
	    System.out.println(boat.type);
	    System.out.println(boat.owner);
	    
	    Boat boat1=new Boat(true);
	    System.out.println(boat1.name);
	    System.out.println(boat1.color);
	    System.out.println(boat1.companyName);
	    System.out.println(boat1.type);
	    System.out.println(boat1.owner);
	    
	    Boat boat2=new Boat("RMS Titanic","Cruise");
	    System.out.println(boat2.name);
	    System.out.println(boat2.color);
	    System.out.println(boat2.companyName);
	    System.out.println(boat2.type);
	    System.out.println(boat2.owner);
	    
	    Boat boat3=new Boat("White Star Line","false");
	    System.out.println(boat3.name);
	    System.out.println(boat3.color);
	    System.out.println(boat3.companyName);
	    System.out.println(boat3.type);
	    System.out.println(boat3.owner);
	    
	    Boat boat4=new Boat("Titanic",false,"RMS Titanic","Cruise","White Star Line");
	    System.out.println(boat4.name);
	    System.out.println(boat4.color);
	    System.out.println(boat4.companyName);
	    System.out.println(boat4.type);
	    System.out.println(boat4.owner);
	    
	}

}
