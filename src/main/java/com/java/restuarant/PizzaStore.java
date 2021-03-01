package com.java.restuarant;

public class PizzaStore extends Pizza implements Size, Toppings {
	
	public void handTossed() {
		 System.out.println("This is hand tossed and the constructor");
	}

	@Override
	public void crust() {
		System.out.println("This is abstract Crust method");
		
	};
	
	public static void main(String[] args) {
		Pizza pz = new PizzaStore();
		pz.crust();
		pz.handtossed();
//		pz.meats("fish");
		
	}

	public void sauce() {
		System.out.println("Marine sauce");
		
	}

	public void cheese() {
		 System.out.println("Pepper Jack Cheese");
		
	}

	public void vegetables() {
		System.out.println("Tomates, Onion, cucumber, Jalopenos");
		
	}

	public void small() {
		System.out.println("10''");
		
	}

	public void medium() {
		System.out.println("12''");
		
	}

	public void large() {
		System.out.println("14''");
		
	}

	public void meats(String meatType) {
		// TODO Auto-generated method stub
		
	}

}
