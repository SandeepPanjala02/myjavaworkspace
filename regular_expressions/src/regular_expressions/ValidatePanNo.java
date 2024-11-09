package regular_expressions;

import java.util.regex.MatchResult;

/*
 * 1. Only allowed characters a-z, 0-9, ., -
 * 2. Should begins with alphabet
 * 3. must contain @ character
 * 4. ends with .com, .in, .org , .edu
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePanNo {
	public static void main(String[] args) {
		
		String str = "DGHPG2498L";
		
	     String regex = "[A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9][A-Z]";	
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		
		if(m.find() && m.group().equals(str)) {
			System.out.println("valid PanNo");
			
		}else {
			System.out.println("invalid PanNo");
		}
			
		
	}

}
