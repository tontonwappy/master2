package com.sup2i;

public class Appli {
	
	
	public static void main(String[] args) {
		
		Compteur comp1 = new Compteur(10, "test1");
		Compteur comp2 = new Compteur(10, "test2");
		Compteur comp3 = new Compteur(10, "test3");
		
		comp1.start();
		comp2.start();
		comp3.start();
		
		try {
			comp1.join();
		comp2.join();
		comp3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
