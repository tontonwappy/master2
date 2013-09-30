
public class compteurThread extends Thread {
	private String nom;
	private int valeurFin;
	java.util.Random rand = new java.util.Random();
	static int fini=1;
	private static Object synchro= new Object();
	
	public compteurThread(String nom, int valeurFin) {
		super();
		this.nom = nom;
		this.valeurFin = valeurFin;
	}



	public void run(){
		for(int i=0;i<=valeurFin;i++){
			System.out.println(this.nom +": "+i);
			try {
				sleep(rand.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized(synchro){
		System.out.println("le compteur "+this.nom+" a fini"+fini++);
		
		}
	}

}
