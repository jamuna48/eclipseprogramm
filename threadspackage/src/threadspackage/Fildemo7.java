package threadspackage;
//listing only files int the directorty
//how to delete?????
import java.io.File;

public class Fildemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	File kk= new File("C:\\Users\\bgvth\\Desktop");
		File kk= new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile");
		
	File[] filefolder = kk.listFiles();
	
	for (File f :filefolder) {
		
	//	if(f.isFile())
	//if(f.isDirectory())	
		
		String name = f.getName();
		int position = name.lastIndexOf(".");
		String next = name.substring(position + 1);
		if(next.equals("txt"))
		//System.out.println(name+ "size" +f.length());	
		f.delete();
		
		
		
	}
		
	}

}
