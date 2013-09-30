package com.sup2i;

public class TrieurAppli {

	public static void main (String[] args){
		int[] t = {5, 8, 3, 2, 7, 10, 1};
		TrieurMultiThread trieur = new TrieurMultiThread(t,0,t.length-1);
		trieur.start();
		try {
			trieur.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <t.length; i++) {
			System.out.print(t[i] + " ; ");
		}
		System.out.println();
		t = new int[] {25, 36, 6, 25, 3};
		trieur = new TrieurMultiThread(t,0,t.length-1);
		trieur.start();
		try {
			trieur.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <t.length; i++) {
			System.out.print(t[i] + " ; ");
		}

	}
}
