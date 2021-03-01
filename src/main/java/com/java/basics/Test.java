package com.java.basics;

public class Test {
	
	protected void _method1(int i){
		System.out.println("  ***");
	}
	
	public void _method2(){
		System.out.println("  ***");
		_method1(2);
	}
	
	private void _method3(){
		System.out.println("  ***");
	}
	
	 void _method4(){
		System.out.println("  ***");
	}
	 
	 static void _method5() {
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 Test basa = new Test(); //instantiation
		 Test._method5();
		 
		 
		
		 
	 }

}
