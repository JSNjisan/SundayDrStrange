package com.upskill.Java_2;

public class IfelseStatement {

	public static void main(String[] args) {
		
    int age = 103;
    
    if (age < 13){
    	System.out.println("you are children");
   
    } else if (age > 13 && age < 18){
    	System.out.println("you are Teenager");
    
    } else if (age >= 65){
    	if (age <= 100){
    		System.out.println("you are Champion");
    	}
        	System.out.println("you are Senior");
   
    }else {
    	System.out.println("you are adult");
    	   	
    } 
    
    }
		
		
	}


