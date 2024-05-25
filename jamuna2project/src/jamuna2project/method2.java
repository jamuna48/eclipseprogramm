package jamuna2project;
/*method without parametres without return type
public class method2 {
	public int addnumbers () {
		int a = 10;
		int b = 20;//methods body
		int sum = a+b;
		return sum;
		
	}
	
	public static void main(String []args) {
		method2 j = new method2();
			int result = j.addnumbers();
		System.out.println(result);
	}
}*/
public class method2{
	public static int addnumbers(int a ,int b) {
		int add = a+b;
		return add;//with parameters
	}
	public static void main(String[]args) {
		
		System.out.println(addnumbers(40,50));
		System.out.println(addnumbers (3000,30000));
	}
	

}
