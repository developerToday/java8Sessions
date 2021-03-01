package com.oops.concept.others;

class JavaExampleOverriding extends JavaMethodExampleOverriding{
		JavaExampleOverriding(){
		System.out.println("Constructor of Child");
	   }
	   void disp(){
		System.out.println("Child Method");
	        //Calling the disp() method of parent class
		super.disp();
	   }
	   public static void main(String args[]){
		//Creating the object of child class
		   JavaExampleOverriding obj = new JavaExampleOverriding();
		   obj.disp();
	   }
	}