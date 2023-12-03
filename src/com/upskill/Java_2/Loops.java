package com.upskill.Java_2;

public class Loops {
		
		/*
		 Types of Loops
		       1. For Loop
		       2. While Loop
		       3. Do While Loop
		       4. Infinite Loop
		      
		*/ 
		
		public static void main(String[] args) {
			practiceForLoop(); 
		}
		 
		public static void practiceForLoop(){                           //For Loop - Do again and again up to upper limit
			int i;                                                      //Initialize the Variable 
			for(i=1; i<=10; i++){                                       //Setting lower limit, Upper limit, Increment or decrement
				System.out.println("For Loops number = " + i);          //Statement 
			}
		}
			
	    public static void practiceWhileLoop(){                         //While Loop - Do again and again up to condition match
			int i = 1;                                                  //Initialize the Variable
			while(i<10){                                                //Setting Condition
				  System.out.println("While Loops number = " + i);      //Statement
			      i++;                                                  //Increment or decrement
			  }
	    }
			
		public static void practiceDoWhileLoop(){					//Do While Loop - Do action then match condition
			int i = 1;												//Initialize the variable
			do{
				System.out.println("Do While Loops number = " + i);	//statement
			} while (i<=10);										//Checking condition
			i++;													//Increment or Decrement
		}
         
		public static void practiceInfiniteLoop(){                      //Infinite Loop - never ending
			int i;                                                      //Initialize the variable 
			for (i=1; i<=10; i++){                                      //Setting no upper limit
				System.out.println("Infinite Loops number = " + i);     //Statement 
			}
		}
       
       public static void practiceNestedForLoop(){                      //Nested Loop - Loop inside another loop                    
          int i;                                                        //Initialize i for loop 1
          int j;                                                        //Initialize j for loop 2
          for (i=1; i<=10; i++){                                        //First loop for i
			  for (j=1; j<=10; j++){                                    //Second loop for j
				  int multipicationTable = i * j;                       //Statement for loop 2
				  System.out.println(multipicationTable + " "); 	  
			  }
			  System.out.println(" ");                                  //Statment for loop 1 
            }
       }      
}
