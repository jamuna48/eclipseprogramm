package threadspackage;
//abstract classes

abstract class Jamuna {
	abstract public void qualification();
}



public class Anclassdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jamuna nn = new Jamuna () {
			public void  qualification()
			{
				System.out.println("my current qualification is hsc");
			}
			
		};
		
		nn. qualification();
	}

}
