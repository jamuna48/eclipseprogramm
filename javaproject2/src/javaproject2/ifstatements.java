package javaproject2;
// if else ladder 
public class ifstatements {

	public static void main(String[] args) {
		String state = "tamilnadu";
		String myname = "jamuna";
		if (state == "tamilnadu") {
			System.out.println("state is tamilnadu");
		}
		else if (state == "tamilnadu" ) {
			System.out.println("state ");//true
		}
		else {
			System.out.println(state );
		}
		if (myname == "jamuna" ) {
			System.out.println("my name is jamuna");//false
		}
		else if (myname == "jamuna") {
			System.out.println("mynmae is mahalakshmi");//false
		}
		else if (myname == "mallika") {
			System.out.println("mynaame is mallika");//false
		}
		else {
			System.out.println("myname");//executes when all false is true
		}
	}

}
