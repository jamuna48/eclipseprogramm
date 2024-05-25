package threadspackage;

public class Jionthread extends Thread {
  public void run() {
	  for(int j =0;j<=5;j++) {
		  try {
			  Thread.sleep(1000);
			  System.out.println("amma"+j);
		  }
		  catch(InterruptedException k) {
			  System.out.println("interrupted------------------****");
			  
		  }

	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
