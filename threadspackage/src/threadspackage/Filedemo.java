package threadspackage;
import java.io.File;


public class Filedemo {
	public static void main(String[]args) {
		//File  ff = new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\exam70\\jamuanmark\\marksheet");
		File  ff = new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\exam70\\jamuanmark\\marksheet\\jmark.txt");
		//System.out.println( ff.mkdir());
		//System.out.println(ff.exists());// tests whether file and directory
		if (!ff.exists()) {
			
		//
			ff.mkdirs();		}
		}

}
      