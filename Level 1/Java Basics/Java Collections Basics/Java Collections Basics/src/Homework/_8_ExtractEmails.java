package Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _8_ExtractEmails {
	private Pattern pattern;
	private Matcher matcher;
 
	private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 
	public void EmailValidator() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}
	public boolean validate(final String hex) {
		 
		matcher = pattern.matcher(hex);
		return matcher.matches();
 
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please enter text to search emails into");
		Scanner input = new Scanner(System.in);
		
		

		// find all words starting with m or c, and ends with n or r or s. 
		// RegEx backslash should be escaped with an additional one.
		Pattern p = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
		String s = input.nextLine();
	    Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(s);
	    while (m.find()) {
	    	if(m.group().charAt(m.group().length() -1) == '.'){
	    		 System.out.println(m.group().substring(0, m.group().length() - 1));
	    	}
	    	else{
	    		 System.out.println(m.group());
	    	}
	       
	    }
	}

}
