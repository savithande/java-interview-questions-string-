package interview.examples.programs;

import java.util.Scanner;

public class EvenOrOdd {
	public static void isEvenOrOdd(int num) {
		
		if (num % 2 == 0) {
			System.out.println("given number is even : "+num);
		}else {
			System.out.println("the given number is odd : "+num);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		
		isEvenOrOdd(number);
	}

}
