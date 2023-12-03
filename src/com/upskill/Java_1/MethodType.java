package com.upskill.Java_1;

public class MethodType {

	/* Types of Methods 

	1. Void Method
	2. Static Method
	3. Return Type Method 
	
	*/ 
	
	public static void main(String[] arg) {
		
		MethodType obj = new MethodType();
		obj. annualIncomeVoid(); 
		
		weeklyIncomeStatic();
		
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		System.out.println (name());
	}
	
	
	static int hourlyIncome = 65; 
	
	//void method 
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome); 
	}

	//static method 
	public static void weeklyIncomeStatic(){
			int calculateweeklyIncome = hourlyIncome * 40;
			System.out.println("My weekly Income = " + calculateweeklyIncome); 
		}
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
		
	}
	
		public static String name(){
			return "Halal";
			 
		}
}



