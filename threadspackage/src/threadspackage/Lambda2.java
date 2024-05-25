package threadspackage;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello ll = (no1, no2 )-> {     System.out.println("hi jamuna.....ypur mark is"+ (no1+no2)); };
		 //ll.demo();
		
		Hello ll = (b,c )-> {return(b+c);
			
		};
		int k=  ll.addition(90,90);
		 System.out.println("final answer is--------"+ k);

		 
	}

}
