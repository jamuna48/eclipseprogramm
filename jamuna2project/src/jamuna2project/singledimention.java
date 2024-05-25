package jamuna2project;
// used to store a multiple values in one variable and collection of similiar data types
/*public class singledimention {
	public static void main(String[]args) {
		//String[] name = {"jamuna","anand","selvaraj","mahalakshmi"};
		int[] name= new int [6];
		name [0] = 20;
		name[2] = 23;
		System.out.println(name[5]);
		System.out.println(name[3]);
		System.out.println(name[0]);	*/
public  class singledimention {
	public static void main(String[]args) {
		String [] name = {"jamuna","mahalakshmi","ananthkumar","selvaraj"};
	/*	System.out.println(name[3]);
		System.out.println(name[0]);
		System.out.println(name[2]);
		System.out.println(name[1]);*/
		int i = 0 ;
		for (i=0; i < name.length ; i++ ) {
			System.out.println(name[i]);
		}
		/*else {
			System.out.println("wrong answer"); 
			}*/
}
	
}

