package java.interview.examples.questions;

public class MainClass {

	public static void main(String[] args) {
		Pallindrome pallindrome = new Pallindrome();
		String str = "aba";
		
		System.out.println(pallindrome.isPallindromeString(str));
	}

}