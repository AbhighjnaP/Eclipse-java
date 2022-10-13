package com.xworkz.copy.boot;
import com.xworkz.copy.Developer;

public class DeveloperRunner {
	
	public static void main(String[] args) {
		
		Developer name= new Developer();
		Developer education = new Developer();
		Developer experience= new Developer();
		Developer salary= new Developer();
		Developer company = new Developer();
		
		name.Name="Lakshmi";
		education.Education="B.E";
		experience.Experience=3;
		salary.Salary=75000;
		company.Company="LogMeIn";
		
		System.out.println(name.Name);
		System.out.println(education.Education);
		System.out.println(experience.Experience);
		System.out.println(salary.Salary);
		System.out.println(company.Company);
		
	}

}
