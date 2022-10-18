package com.xworkz.blacky.Boot;
import com.xworkz.blacky.Fish;

public class FishRunner {

	public static void main(String[] args) {
		
		Fish fish=new Fish("Rahu");
		System.out.println(fish.name);
		System.out.println(fish.type);
		System.out.println(fish.price);
		System.out.println(fish.weight);
		System.out.println(fish.length);
		
		Fish fish1=new Fish(250,"Sea fish");
		System.out.println(fish1.name);
		System.out.println(fish1.type);
		System.out.println(fish1.price);
		System.out.println(fish1.weight);
		System.out.println(fish1.length);
		
		Fish fish2=new Fish(49.5,650);
		System.out.println(fish2.name);
		System.out.println(fish2.type);
		System.out.println(fish2.price);
		System.out.println(fish2.weight);
		System.out.println(fish2.length);
		
		Fish fish3=new Fish(650,26.5);
		System.out.println(fish3.name);
		System.out.println(fish3.type);
		System.out.println(fish3.price);
		System.out.println(fish3.weight);
		System.out.println(fish3.length);
		
		Fish fish4=new Fish("Bangde","Sea fish",250,1.5,3.4);
		System.out.println(fish4.name);
		System.out.println(fish4.type);
		System.out.println(fish4.price);
		System.out.println(fish4.weight);
		System.out.println(fish4.length);
		
		
		
				
				
		
		
				
		
	}

}
