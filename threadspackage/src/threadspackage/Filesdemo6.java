package threadspackage;

import java.io.File;

public class Filesdemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File kk= new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\mark.txt");
		
		
		try {
		kk.createNewFile();}
		catch(Exception k) {
			System.out.println("no files");
		}
		
		File newname = new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\publicmark.txt");
		
	boolean answer =	kk.renameTo(newname);
	System.out.println("rename successful "+ answer);
	System.out.println(newname.getName());
	}

}
