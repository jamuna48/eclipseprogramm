package jamuna2project;
//methodoverloading2
public class method3 {
	public static int numbers(int a, int b ) {
		int result = a>b?a:b;
		return result;
		
	}
	public static double numbers(double a, double b ) {
		double result = a>b?a:b;
		return result;
		
	}
	public static char numbers(char a, char b ) {
		char result = a>b?a:b;
		return result;
		
	}
	public static void main(String[]args) {
		/*	method3 k = new method3();//-----with object
			 int answer = k.numbers(20,30); */
		int answer  = numbers(20,30);
		double second = numbers (2.5,2.6);
		char third = numbers('j','c');
			System.out.println(answer);// answer false so the output is b=30
			System.out.println(second);
			System.out.println(third);
	}
}
