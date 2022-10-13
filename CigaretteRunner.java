package com.xworkz.copy.boot;

import com.xworkz.copy.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {

		Cigarette cigarette = new Cigarette();

		System.out.println(cigarette.Brand);
		System.out.println(cigarette.Color);
		System.out.println(cigarette.Price);
		System.out.println(cigarette.Length);
		System.out.println(cigarette.NoOfCigarette);
		System.out.println(cigarette.MfgDate);
		System.out.println(cigarette.Component);
		System.out.println(cigarette.Types);
		System.out.println(cigarette.BestOne);
		
		cigarette.BarCode=5484516;
		cigarette.BatchNo=2156;
		cigarette.Flavour="Green Apple";
		cigarette.Writing="Smoking injuries to health";
		cigarette.Infections="Lung cancer";
		cigarette.OutCome="Smoke";
		cigarette.ExpDate=2022;
		cigarette.TypesOfSmokers="Chain Smokers";
		
		System.out.println(cigarette.BarCode);
		System.out.println(cigarette.BatchNo);
		System.out.println(cigarette.Flavour);
		System.out.println(cigarette.Writing);
		System.out.println(cigarette.Infections);
		System.out.println(cigarette.OutCome);
		System.out.println(cigarette.ExpDate);
		System.out.println(cigarette.TypesOfSmokers);
		
		
		
	}

}
