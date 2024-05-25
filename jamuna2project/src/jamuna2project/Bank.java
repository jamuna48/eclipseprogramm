package jamuna2project;//oops class Currentbill 
class Bank {
	String name ;//intialization through the reference
	int enumber;
	short amount ;
	
	public void payment () {
	System.out.println("name of tha houseowner" + name);
	System.out.println("eb number"+ enumber);
	System.out.println("total payment rs" + amount);
	}
 }
	
public class Bank {
	/*String name = "lakshmi";
	long phno = 9976883467l ;//main with in the class
	long acnumber = 01714000004566l;
	int total = 1000000;
	  public int withdraw (int x , int y) {
		  int amount =  x + y ;
		  return amount;*/
		  
	  
	  public static void main(String[]args) {
		/*Bank result = new Bank ();
		int money = result.withdraw(200,200);
		System.out.println(money);*/
		  Currentbill eb = new Currentbill();
		  
		  eb.name = "maliika";
		  eb.enumber = 809;
		  eb.amount = 700;
		  eb.payment();
				  
		  
	}


}

 
