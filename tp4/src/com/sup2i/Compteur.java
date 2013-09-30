package com.sup2i;

import java.util.Random;

public class Compteur extends Thread {

	private int n;
	private String name;
	private static Integer i = 0;
	

	public Compteur(int n, String name){
		this.n = n;
		this.name = name;
	}

	public void run(){
		for (int i = 0; i <= this.n; i++ ){
			Random r = new Random(0);
			try{
				sleep(r.nextInt(1000));
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " : " + i + "            " + r.nextInt(1000));
		}
		synchronized (i) {
			i++;
			System.out.println(name+" a finit de compter en position "+ i);	
		}
	}

}
