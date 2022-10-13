package com.xworkz.copy.boot;
import com.xworkz.copy.Tea;

public class TeaRunner {
	
	public static void main (String[] args) {
		
		Tea tea=new Tea();
		
		System.out.println(tea.Color);
		System.out.println(tea.Brand);
		System.out.println(tea.Weight);
		System.out.println(tea.Price);
		System.out.println(tea.Brand);
		System.out.println(tea.PackColor);
		System.out.println(tea.Length);
		System.out.println(tea.Width);
		System.out.println(tea.Ingrediants);
		System.out.println(tea.BatchNo);
		
		tea.Barcode=566765;
		tea.Flavour="Chocolate";
		tea.MfgDate=2021;
		tea.BestBefore=2022;
		tea.Calories=125.8;
		tea.Taste="Sweet";
		tea.Energy=30;
		tea.Quality="Good";
		tea.Quantity=5;
		
		System.out.println(tea.Barcode);
		System.out.println(tea.Flavour);
		System.out.println(tea.MfgDate);
		System.out.println(tea.BestBefore);
		System.out.println(tea.Calories);
		System.out.println(tea.Taste);
		System.out.println(tea.Energy);
		System.out.println(tea.Quality);
		System.out.println(tea.Quantity);
		
		
		
	}

}
