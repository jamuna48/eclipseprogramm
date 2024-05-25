package javaproject2;
//arithmetic operaters are + - / % ++x --x
public class operators {
	public static void main(String[]args) {
		int a = 22,b = 2;
		int c = a/b; //answer is 11 because it is integer
		System.out.println(c);
		//if you want a accuurate value , use double,int 
		double d1 = 29;
		double d2 = 2;
		System.out.println(d1%d2);
		// %modulus(remainder)	
	int i1 = 22, i2 = 2, g;
	i1 += 89; //also same i1=i1%i2		i1 %=i2-compound assignment for all arithmetic operaters (* - + / % )
	System.out.println(i1);
	//increments and decrement
//x++ - post increment
//++x -pre increment
	int n1 = 45,n2 = 9, u1;
	 // ans 4,5
	u1 = ++n1; // ans 5,5
	System.out.println(u1);//home work
	System.out.println(n1);
	 int g1 = 3, g2 = 4, g3;
	 g3 = g1 + g2 + g1++ + g2++ + ++g1 + ++g2;
	 System.out.println(g3);
	 int n = 4;
	 ++n;
	 int m = 8;
	 --m;
	 System.out.println(m);
	}

}
