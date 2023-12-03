package com.upskill.Java_6;

//public class MultiThredingThred {

	public class MultiThreadingThread extends Thread {
	public void run(){
		try{
			System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Running");
		} catch (Exception e){
			System.out.println("Exception is caught");
		}
	}

}

