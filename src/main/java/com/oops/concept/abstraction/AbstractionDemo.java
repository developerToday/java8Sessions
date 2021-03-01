package com.oops.concept.abstraction;
//abstract parent class
abstract class AbstractClass{
   //abstract method
   public abstract void sound();
}
//Dog class extends Animal class
public class AbstractionDemo extends AbstractClass{

   public void sound(){
	System.out.println("Woof");
   }
   public static void main(String args[]){
	AbstractClass obj = new AbstractionDemo();
	obj.sound();
   }
}