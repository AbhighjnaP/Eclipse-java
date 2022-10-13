package com.xworkz.copy.boot;

import com.xworkz.copy.Dustbin;

public class DustbinRunner {

	public static void main(String[] args) {
		
		Dustbin dustbin= new Dustbin();
		
		System.out.println(dustbin.Brand);
		System.out.println(dustbin.Color);
		System.out.println(dustbin.Length);
		System.out.println(dustbin.Width);
		System.out.println(dustbin.Capacity);
		System.out.println(dustbin.Weight);
		System.out.println(dustbin.Material);
		System.out.println(dustbin.Lid);
		System.out.println(dustbin.price);
		
	dustbin.Type="Automatic,Buttons";
	dustbin.Uses="Collecting wastes";
	dustbin.Shape="Cylinder,Box";
	dustbin.NoOfTypes=4;
	dustbin.Movement="Removable tubs,Wheels";
	
	
	System.out.println(dustbin.Type);
	System.out.println(dustbin.Uses);
	System.out.println(dustbin.Shape);
	System.out.println(dustbin.NoOfTypes);
	System.out.println(dustbin.Movement);
	
				

	}

}
