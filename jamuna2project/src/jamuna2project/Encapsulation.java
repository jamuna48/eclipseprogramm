package jamuna2project;
class ATM{
	String atmcard  ;
	String name ;
	private int secretnumber ;
	int amount ;

ATM(String a,String b, int h ,int d){
 atmcard = a;
 name = b ;
 secretnumber= h;
	 amount =d ;}


public void withdraw() {
	System.out.println(amount);
System.out.println(secretnumber);

}//encapsulation


}
public class Encapsulation {
	public static void main(String[]args) {
		ATM accounter = new ATM("sbi","jamuna", 1234, 1000);
		
		accounter. withdraw();
		
	}

}
