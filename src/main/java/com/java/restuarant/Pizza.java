package com.java.restuarant;

public abstract class Pizza {
	
	public abstract void crust();
	
	public void handtossed() {
		System.out.println("Hand Tossed Pizza");
	}
	
	public void HandMadePan() {
		System.out.println("HandMadePan Pizza");
	}
	
	public void CrunchyThinCrust() {
		System.out.println("CrunchyThinCrust Pizza");
	}
	
	public void BrooklynStyle() {
		System.out.println("BrooklynStyle Pizza");
	}
	
	public void GlutenFreeCrust() {
		System.out.println("GlutenFreeCrust Pizza");
	}

}
