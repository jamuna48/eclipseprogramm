package threadspackage;

public class Babythread extends Thread {

	
	public void run() {
		for (  int i = 0;i<10;i++) {
			Thread.yield();
			System.out.println("jamuna----"+ i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
