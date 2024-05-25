package threadspackage;

public class BabyCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babythread bt = new Babythread();
	//bt.run();
		/*System.out.println(bt.getState());
		bt.setPriority(1);// int value up to 1 -10
			System.out.println( "name of the thread is ----------"+bt.getName());
			bt.setName("ananththread");
			System.out.println("after the setname is --------"+ bt.getName());*/
		bt.start();
		//System.out.println(bt.getState());
	//	bt.start();// creates a new thread//that is multithreading(paralel execution)
		
		
		
		
//		jamuthread  j = new jamuthread();
//		System.out.println(j.getState());
//		j.start();
		for (int k =0;k<10;k++) {
			System.out.println("babycalling-----"+ k);
			
			//System.out.println(bt.getState());//dead or termib=nated or blocking
		}
		
	}

}