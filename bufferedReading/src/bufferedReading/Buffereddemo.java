package bufferedReading;

import java.io.*;

public class Buffereddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		File kk= new File("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\jamuna.txt");
		FileWriter l;
				try {
					kk.createNewFile();
				 l = new FileWriter(kk,true);

					BufferedWriter bf = new BufferedWriter(l);
					bf.write("my science mark is 95");
					
					
					bf.newLine();
					bf .write("my maths mark is 86");
					bf.write("my soacial mark is 95");
					bf.flush();
					//System.out.println("hiii");
				FileReader jamu= new FileReader("C:\\Users\\bgvth\\Desktop\\jamunajavafile\\jamuna.txt");
				BufferedReader bw = new BufferedReader (jamu);	
				String br =  bw.readLine();//buffered reading
				//System.out.println(br);
				int acount= 0;//number of lines
				
				while(br != null) {
					
					
					
					
					
				


					
				}
				System.out.println(" no of lines -------->"+ acount);
				}
				catch(IOException mm){
					
					
				}
	}

}


