package com.sup2i.producteur;

public class Main {

	/**
	 * @param args
	 */

		  public static void main(String [] args) 
		  { 
		   Buffer buffer = new Buffer(); 
		   Producteur p1 = new Producteur(buffer); 
		   Producteur p2 = new Producteur(buffer); 
		   Consommateur c1 = new Consommateur (buffer);   
		   Consommateur c2 = new Consommateur (buffer); 
		   p1.start(); 
		   p2.start();   
		   c1.start(); 
		   c2.start(); 
		  } 

}
