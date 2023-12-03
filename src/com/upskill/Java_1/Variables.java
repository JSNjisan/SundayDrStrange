package com.upskill.Java_1;

public class Variables {

	// Variables in Java
	
	// Instance OR global variable - Variables declared in class level, outside method
	
	// Static variable - variables belong to class and don't required creating object 
	
	// Local variable - Variable declared in methods 
	
	// Method parameter - Variable used as method parameter 
	
	public static void main(String[] args) {
		
		Variables obj = new Variables(); 
        obj.newyork();
        obj.texas("steak");
        System.out.println(President);
	}
	
	String country = "Habibi";   // Instance OR global variable - Variables declared in class level, outside method
	static String President = "Boltu"; // Static variable - variables belong to class and don't required creating object 
	
	public static void newyork(){
		
	String city = "Queens";          // Local variable - Variable declared in methods
	String police = "HalalFighter";
	System.out.println(police);
	}
	
	public static void texas(String food){         // Method parameter - Variable used as method parameter
		
		String city = "Irving";
		String police = "HaramFighter";
		System.out.println(police);
		System.out.println(food);
	}
	
}
