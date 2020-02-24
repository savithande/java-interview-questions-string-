package interview.examples.programs;

import java.util.Scanner;

public class FindGCDOf2Numbers {
	public static void findGcd(int num1,int num2) {
		int gcd = 0; 
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				gcd = i;
			}
		}
		System.out.println("the gcd of num1 and num2 is :"+gcd);
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num1 and num2");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		findGcd(num1, num2);
	}
}
