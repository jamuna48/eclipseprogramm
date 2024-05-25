package classesjamuna;

public class String1 {
	public String toString() {
		return "jamuna";
	}
	public int hashCode() {
		return 123445667;
	}
	public boolean  equals(Object j) {
		return true;
	}

	public static void main(String[]args) {
		String1 j = new String1();
	//	System.out.println(j);// called internaly tostring()method
		System.out.println(j.hashCode());
		
		String1 j1 = new String1();
		System.out.println(j1.hashCode());
		if(j.equals(j1)) {
			System.out.println("yes, its equal");
		}
		
		else {
			System.out.println("not equal");
		}
		
		
	}

}
