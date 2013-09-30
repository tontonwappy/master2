package com.sup2i.producteur;

class Producteur extends Thread {  
	private Buffer buffer;  
	public Producteur(Buffer b) {
		buffer = b; } 
public void run() 
{ 
	String [] legumes = { "Poireaux", "Tomates", "Epinards" }; 
	for(int i = 0; i < 3; i++) {    
		try { 
			
			sleep(1000);
			} catch(Exception e) {
				
			}    
		buffer.deposer(legumes[i]); 
	} 
} 
} 
