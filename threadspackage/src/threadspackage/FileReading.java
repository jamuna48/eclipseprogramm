package threadspackage;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File kk= new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\stationaries.txt");
	try {
		kk.createNewFile();
		FileWriter l = new FileWriter(kk);
	l.write(" hi jamuna ");
	l.write(89);
	l.flush();
	l.close();

	FileReader reader = new FileReader(kk);
	int result = reader.read();
	while(result!= -1) {
	
System.out.println((char )result);
result = reader.read();	
	}
	char[] jj = new char[(int)kk.length()];
	System.out.println("array length is --------" +jj.length);
	System.out.println(" answer is   -------"+jj[3]);

	}
	catch(Exception e) {
		
	}
	
	
		
	}

}
