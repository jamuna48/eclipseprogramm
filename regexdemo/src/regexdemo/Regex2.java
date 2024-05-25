package regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Pattern nn = Pattern.compile("welcome$");
		//	Pattern nn = Pattern.compile("[jjkl]");
		//	Pattern nn = Pattern.compile("[^l]");
		//Pattern nn = Pattern.compile("[^a-zA-Z0-9]");
	//	Pattern nn = Pattern.compile("\\S");// \\s only for space
		//Pattern nn = Pattern.compile("\\d");// digits-------> \\d 
	//	Pattern nn = Pattern.compile("\\D");
	//	Pattern nn = Pattern.compile("\\w");
	//	Pattern nn = Pattern.compile("\\W");
	//	Pattern nn = Pattern.compile("\\bj");
	//	Pattern nn = Pattern.compile("j\\B");
		String sentences = " jkjkjkjkiiiooojjj  jamunajamunaananth kl1111244  5******&%##$$# 123344567 ";

		Pattern nn = Pattern.compile("\\Gjamuna");
			
		Matcher mm = nn.matcher (sentences);
		
			while(mm.find()) {
				System.out.println(mm.group() + "starts" + mm.start() );
			}

	}

}
