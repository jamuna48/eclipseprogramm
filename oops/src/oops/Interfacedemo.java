package oops;//als known as multiple inheritance
  interface diploma {
	public void eligible();
	
}
interface age{
	  public void agelimit();
}

interface Candidate/* diploma*/{
	public void hsc();//interface method does not have a body
}
class Zoho implements Candidate ,diploma{
	public void hsc() {
		System.out.println("pass");}
		public void eligible() {
			System.out.println("yes eligible");
		}
		
		
	}
class Zstudent extends Zoho  implements age {
	public void agelimit() {
		System.out.println("18");
	}
	
}
public class Interfacedemo {
public static void main (String[]args) {
	Zoho j1 = new Zoho ();
	j1.hsc();
	j1.eligible();
	Zstudent a1 = new Zstudent ();
	a1.hsc();
	a1.agelimit();
}
}
