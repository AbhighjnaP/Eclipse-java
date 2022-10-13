package com.xworkz.copy.boot;
import com.xworkz.copy.Bus;

public class BusRunner {
	
	public static void main(String[] args) {
		
		Bus ref = new Bus();
		Bus Start= new Bus();
		Bus Stop= new Bus();
		{
			ref.no=25;
			Start.Starting="Banglore";
			Stop.Destination="Shimoga";
			
			System.out.println(ref.no);
			System.out.println(Start.Starting);
			System.out.println(Stop.Destination);
		}
		
	}

}
