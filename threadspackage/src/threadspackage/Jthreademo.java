package threadspackage;

public class Jthreademo {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		Jionthread  jk =new Jionthread ();
		jk.start();
	//	jk.join();
		jk.interrupt();
		System.out.println("hi jamuna");
		System.out.println("how are you ");
		System.out.println("nice to meet you");
	}

}

