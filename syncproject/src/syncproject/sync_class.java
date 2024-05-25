package syncproject;
class Icecream{
	public  static synchronized void totalMembers( ) {
	/*synchronized(this){*/
		Thread th = Thread.currentThread();
for(int i = 1 ; i<=10;i++) {
		
try {
		Thread.sleep(100);
		System.out.println(th.getName()+ " "+ i );
		} catch(Exception ee) {
			
		}
	}
}
}
//}

public class sync_class {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		sync_class mm =  new sync_class ();
		
		// Icecream obj = new  Icecream();
		 Threaddemo t1 = new Threaddemo ();
		 Thread2  t2 = new Thread2 ();
		 t1.start();
	
		 //t1.join();
		 t2 .start();
		}

}



