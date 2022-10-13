package com.xworkz.copy.boot;
import com.xworkz.copy.Chocolates;

public class ChocolatesRunner {

	public static void main(String[] args) {
		
		Chocolates brand = new Chocolates();
		Chocolates name = new Chocolates();
		Chocolates price= new Chocolates();
		Chocolates flavour= new Chocolates();
		
		brand.Brand="Cadbury";
		name.Name="DairyMilk";
		price.Price=180;
		flavour.Flavour="Fruit and nut";
		
		System.out.println(brand.Brand);
		System.out.println(name.Name);
		System.out.println(price.Price);
		System.out.println(flavour.Flavour);
		
		
		
		

	}

}
