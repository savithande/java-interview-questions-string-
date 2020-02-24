package interview.examples.programs;

import java.util.Scanner;

public class PallindromeMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the String : ");
		String str = scanner.nextLine();
		
		Pallindrome pallindrome = new Pallindrome();
		pallindrome.isPallindrome(str);
	}

}
