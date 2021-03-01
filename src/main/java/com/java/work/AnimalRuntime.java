package com.java.work;

public class AnimalRuntime extends AnimalsoundRuntime 
{
	public void Dog()
	{
		System.out.println("Boowwwww");
	}
public static void main(String[] args) 
{
	AnimalsoundRuntime sounds = new AnimalRuntime(); // 
	sounds.Dog();
	
}

}
