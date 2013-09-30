
public class lanceCompteur {


	 static Thread compt1=new compteurThread("toto1", 10);
	 static Thread compt2=new compteurThread("toto2", 10);
	 static Thread compt3=new compteurThread("toto3", 10);
	public static void main(String[] args) {
		 compt1.start();
		 compt2.start();
		 compt3.start(); 
		 try {
			compt1.join();
			compt2.join();
			compt3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
