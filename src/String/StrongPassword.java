package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int count = 0;
		String pwd = s.nextLine();
		
		Pattern patternDigit = Pattern.compile("(\\d)");
		Pattern patternLower = Pattern.compile("([a-z])");
		Pattern patternUpper = Pattern.compile("([A-Z])");
		Pattern patternSpecial = Pattern.compile("(\\W)");
		
		Matcher digit = patternDigit.matcher(pwd);
		Matcher lower = patternLower.matcher(pwd);
		Matcher upper = patternUpper.matcher(pwd);
		Matcher special = patternSpecial.matcher(pwd);
		
		if(!digit.find())
			count++;
		
		if(!lower.find())
			count++;
		
		if(!upper.find())
			count++;
		
		if(!special.find())
			count++;
		
		if((count+pwd.length()) <6)
			count = 6-pwd.length();
		
		System.out.println(count);
		
	}
}
