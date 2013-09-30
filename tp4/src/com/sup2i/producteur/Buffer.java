package com.sup2i.producteur;

public class Buffer {

	/**
	 * @param args
	 */
	private boolean vide = true;  
	private String contenu = null; 
	synchronized void deposer(String legumes) {
		while(! vide) {
			try { wait(); }    
			catch(InterruptedException e) {
				
			} 
		} 
		contenu = legumes;   
		vide = false; 
		notifyAll(); 
	} 
	
	synchronized String prendre() {   
		while(vide) {    
			try { wait(); 
			} 
			catch(InterruptedException e) {
				
			} 
		} 
		vide = true;   notifyAll(); 
		return contenu; 
	} 


}