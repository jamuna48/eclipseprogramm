package jamuna2project;
//constructor overloading is same constructor  name with different parameters
class hospital {
 String name;
 int age ;
 long phno ;
 long adharno ;
 String village ;
 String city;
 String rationcard;
 String attender;
 int ipno = 6789;
 public void patientinfo() {
	 
	 System.out.println(name );
 System.out.println(age);
 System.out.println(phno);
 System.out.println(adharno);
 System.out.println(village);
 System.out.println( city);
 System.out.println(rationcard);
 System.out.println(attender);
 System.out.println(ipno);
 
 }
 hospital ( String a,int b, long c , long d , String e ,String f ){
	 name = a ;
	 age = b;
	 phno = c;
	 adharno = d;
	 village = e ;
	 city = f;
	 
 }//outpatient 
 hospital (String a,int b, long c , long d , String e ,String f,String g,String i){
	 name = a ;
	 age = b;
	 phno = c;
	 adharno = d;
	 village = e ;
	 city = f;
	 rationcard= g;
	 attender = i;
	 
 }
	 
	 
 }

public class constructor2 {
	public static void main(String[]args) {
		
		 hospital pt1 = new hospital("hari", 20, 1234567890, 1234567890,"veerapandi", "theni" );
		hospital pt2 = new hospital ("yadhivi", 34 , 9934567, 98875632, "kuduvanjeri" , "chennai" , "sundari", "ganesh");
		 pt1.patientinfo();
		 pt2.patientinfo();
		

	}

}
