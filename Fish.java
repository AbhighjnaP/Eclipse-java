package com.xworkz.blacky;

public class Fish {
	
	public String name;
	public String type;
	public int price;
	public double weight;
	public double length;
	
	public Fish() {
		System.out.println("Created Fish method");
		
	}
	
	public Fish(String name)
	{
		this.name=name;
		System.out.print("created name of the fish");
	}
	
	public Fish(int price,String type)
	{
		this.price=price;
		this.type=type;
		System.out.println("price of the fish is:" +price);
		System.out.println("type of the fish is :" +type);
	}
	
	public Fish (double weight,int price)
	{
		this.weight=weight;
		this.price=price;
		System.out.println("weight of the fish is:" +weight);
		System.out.println("price is :"+price);
	}
	
	public Fish(int price,double length)
	{
		this.price=price;
		this.length=length;
		System.out.println("price is:"+price);
		System.out.println("Length is:"+length);
		
	}
	
	public Fish(String name,String type,int price,double weight,double length)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		this.weight=weight;
		this.length=length;
		System.out.println("Name is");
		System.out.println("Type is");
		System.out.println("Price is");
		System.out.println("Weight is");
		System.out.println("Length is");
		
	}
	
	
	

}
