package regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo3 {
	public static void main(String[] args) {
		String str = "This is Smith . My contact no. 9988776655 and 8877665544";
		
		String regex = "[6-9][0-9]{9}";
		
           Pattern p = Pattern.compile(regex);
		
	     	Matcher m = p.matcher(str);
		
		while(m.find()) {
			//System.out.println("Mobile number is found");
			System.out.println(m.group());
			
		}
		
			
	}

	


}