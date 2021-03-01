package com.java.work;

public class Bird extends AnimalKingdom {
	public void sound()
	{
		System.out.println("Bird KUKUKU");
	}
    
	public void move()
	{
		System.out.println("Bird Flys");
	}
	public static void main(String[] args) 
	{
		AnimalKingdom bird = new Bird(); // 
		bird.sound(); // Bird KUKUKU
		bird.move();  // Bird Flys
		
		AnimalKingdom ak = new AnimalKingdom();
		ak.sound();  
	}
}
