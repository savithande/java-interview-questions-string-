package interview.examples.programs;

import java.util.Scanner;

public class FindTheSumOfNumber {
	public static void sumOfNumber(int number) {
		int sum = 0;
		while (number != 0 ) {
			sum = sum + number % 10;
			number = number / 10;          
		}									 
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		
		sumOfNumber(num);
	}

}
