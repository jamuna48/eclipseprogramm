package regexdemo;

import java.util.regex.Pattern;
import java.util.regex .Matcher;

public class Regex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentences = " hello welcome to my house .hi nice to meet you .  ";
	//	Pattern nn = Pattern.compile("welcome$");
		Pattern nn = Pattern.compile("l|a");
		Matcher mm = nn.matcher (sentences);
		int count = 0 ;
		
		while(mm.find())
		{
			count++;
				
		System.out.println(mm.group());
			System.out.println("starts"  + mm.start() + "ends "  + mm.end());
	
		

	}
		System.out.println(count + " times");

}
}