package com.xworkz.copy.boot;
import com.xworkz.copy.Rmd;

public class RmdRunner {

	public static void main(String[] args) {
		
		Rmd rmd=new Rmd();
		
		System.out.println(rmd.Color);
		System.out.println(rmd.Price);
		System.out.println(rmd.Length);
		System.out.println(rmd.Weight);
		System.out.println(rmd.MfgDate);
		System.out.println(rmd.Component);
		System.out.println(rmd.Type);
		System.out.println(rmd.OwnerName);
		System.out.println(rmd.NoOfShipment);
		
		rmd.BatchNo=35148;
		rmd.BarCode=6541484;
		rmd.Flavour="Pan Masala";
		rmd.Writing="Tobacco kills";
		rmd.Infections="Mouth cancer";
		rmd.ExpDate=2022;
		rmd.Smell="Bad";
		rmd.Taste="Bitter";
		rmd.UseIn="Pan";
		
		System.out.println(rmd.BatchNo);
		System.out.println(rmd.BarCode);
		System.out.println(rmd.Flavour);
		System.out.println(rmd.Writing);
		System.out.println(rmd.Infections);
		System.out.println(rmd.ExpDate);
		System.out.println(rmd.Smell);
		System.out.println(rmd.Taste);
		System.out.println(rmd.UseIn);

	}

}
