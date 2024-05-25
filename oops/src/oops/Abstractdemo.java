package oops;
   abstract class publicexam{
    abstract	public void mark();
    
    }
   class Tamil extends publicexam {
	   public void mark() {
		   System.out.println("tamil mark is 98");
	   }
   }
   
   
   class English extends  publicexam{
	   public void mark() {
		   System.out.println("english mark is 80");
	   }
   }
public class Abstractdemo {
	
	public static void main(String[]args) {
	//publicexam p1 = new publicexam()
English e1 = new 	English();
		Tamil t1 = new 	Tamil();
		t1.mark();
	e1.mark();
	}

}
