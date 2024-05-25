package threadspackage;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File  ff = new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\exam70\\jamuanmark\\marksheet\\mark.txt");
	try{
			if (!ff.exists())
			ff.createNewFile();//
		}
		catch (Exception pp) {//doubt
			System.out.println("yea its true");
			
		}
		
	/*	if (ff.exists()) {
			ff.delete();
			
		}*/
		

	System.out.println(	ff.canRead());
	System.out.println(	ff.canWrite());
	}

}
