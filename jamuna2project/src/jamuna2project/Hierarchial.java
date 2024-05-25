package jamuna2project;

class Reserve_Bank_OfIndia{
	
	public  void rbi() {
		System.out.println("ministry of finance Government of india");
	}
}
class State_Bank_ofIndia extends Reserve_Bank_OfIndia{
	
	public void sbi() {
		System.out.println("Indian multinational bank sectorand financial services");
	}
}
class Indian_Overease_Bank extends Reserve_Bank_OfIndia{
	public void iob() {
		System.out.println(" indian public sector ");
	}
	
}
public class Hierarchial {
	public static void main(String []args) {
		Indian_Overease_Bank detail = new Indian_Overease_Bank ();
		detail .rbi();
		
		detail.iob();
		
		
	}

}
