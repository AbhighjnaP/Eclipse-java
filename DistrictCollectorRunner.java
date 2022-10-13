package com.xworkz.copy.boot;
import com.xworkz.copy.DistrictCollector;

public class DistrictCollectorRunner {

	public static void main(String[] args) {
		
		DistrictCollector name = new DistrictCollector();
		DistrictCollector age= new DistrictCollector();
		DistrictCollector district= new DistrictCollector();
		DistrictCollector batchNo=new DistrictCollector();
		
		
		name.Name="Dr.Selvamani R";
		age.Age=34;
		district.District="Shimoga";
		batchNo.BatchNo=2013;
		
		
	
	System.out.println(name.Name);
	System.out.println(age.Age);
	System.out.println(district.District);
	System.out.println(batchNo.BatchNo);
	

	}

}
