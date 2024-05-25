package jamuna2project;
class college{
	public static void jamuna() {
		System.out.println("hii");
	}
	public static void shyamala() {
		System.out.println("hellow");
		jamuna();
	}
}
public class staticdemo {
	
	public static void main(String[]args) {
		college b1 = new college ();
		b1.shyamala();
		
	}

}
