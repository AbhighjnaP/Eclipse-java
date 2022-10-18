package com.xworkz.blacky;

public class Boat {

	public String name;
	public boolean color;
	public String companyName;
	public String type;
	public String owner;
	
	public Boat(String name)
	{
		this.name=name;
		System.out.println("Name of the boat is :"+name);
	}
	
	public Boat(Boolean color)
	{
		this.color=color;
		System.out.println("color is");
	}
	
	public Boat (String companyName,String type) 
	{
		this.companyName=companyName;
		System.out.println("company name is:");
		this.type=type;
		System.out.println("Type is:");
	}
	
	public Boat (String owner,boolean color)
	{
		this.owner=owner;
		System.out.println("Onwer is:");
		this.color=color;
		System.out.println("Color is:");
	}
	
	public Boat(String name,Boolean color,String companyName,String type,String owner) {
		this.name=name;
		this.color=color;
		this.companyName=companyName;
		this.type=type;
		this.owner=owner;
		System.out.println("name is:"+name);
		System.out.println("color is:"+color);
		System.out.println("companyName is:"+companyName);
		System.out.println("type is:"+type);
		System.out.println("owner is:"+owner);
	}
}
