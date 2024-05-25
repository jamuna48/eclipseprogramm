package threadspackage;
import java.io.File;

public class Filedemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File kk= new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile");
		
		String [ ] l= kk.list();
	for(int i = 0;i<l.length;i++) {
		
		if(l[i].charAt(0)== 'e') 
			
		
		
			System.out.println(l[i]);
			}
//		System.out.println(l.length);	
//		System.out.println("print"+ l[0]);

	}

}
