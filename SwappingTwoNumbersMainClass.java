                       package interview.examples.programs;

import java.util.Scanner;

public class SwappingTwoNumbersMainClass {
	public static void main(String[] args) {
		int num1,num2;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter the swapping numbers :  ");
		num1 = scan1.nextInt();
		num2 = scan1.nextInt();
		
		SwappingTwoNumbers swap = new SwappingTwoNumbers();
		swap.numberSwapping(num1, num2);
		System.out.println();
		
		String str1 = " ",str2 = " ";
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter the swapping String : ");
		str1 = scan2.nextLine();
		str2 = scan2.nextLine();
		
		swap.stringSwapping(str1, str2);
		
	}

}
