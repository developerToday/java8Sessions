package com.java.basics;

public class InstanceVariableJavaExample {
	String myInstanceVar = "My variable";

	public static void main(String args[]) {
		InstanceVariableJavaExample obj = new InstanceVariableJavaExample();
		InstanceVariableJavaExample obj2 = new InstanceVariableJavaExample();
		InstanceVariableJavaExample obj3 = new InstanceVariableJavaExample();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);


		  obj2.myInstanceVar = "Your Variable";
		  
		  
		  System.out.println(obj.myInstanceVar);
		  System.out.println(obj2.myInstanceVar);
		  System.out.println(obj3.myInstanceVar);
		 
	}
}