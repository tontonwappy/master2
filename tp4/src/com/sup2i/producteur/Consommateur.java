package com.sup2i.producteur;

class Consommateur extends Thread {  
	private Buffer buffer;  
	public Consommateur (Buffer b) { buffer = b; } 
public void run() 
{ 
	  String legumes; 
	  for(int i = 0; i < 3; i++) {
		  legumes = buffer.prendre(); 
	   System.out.println("Il y avait des " + legumes); 
	  } 
	 } 
	} 
