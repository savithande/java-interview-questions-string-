package java.interview.examples.questions;

public class Pallindrome {
	public static boolean isPallindromeString(String text) {
		
		String reverse = reverse(text);
		
		if (text.equals(reverse)) {
			return true;
		}
		
		return false;
	}

	public static String reverse(String str) {
	  if (str == null || str.isEmpty()) {
		  return str;
	  }
		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length()));
	}
}