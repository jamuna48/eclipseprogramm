package javaproject2;
//for loop and nested loop
public class Controlstatement {
public static void main(String[] args) {
		int i;
		outerloop://lable
		for (i = 0;i<=3; i++) {
			
		//System.out.println("jamuna");//10 times exe.
		innerloop:
			for (int k = 0;k<=i;k++) {
				//System.out.println(k);//executes 4 * 10=40
				/*
				 * if (i==2 && k == 2) { break outerloop; }
				 */
		
				System.out.println(k);
			}
		System.out.println();
		}

	
	}



}