package com.upskill.Java_6;

public class MultiThreadingRunable {

	
	public void run(){
		try{
			System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}
}
