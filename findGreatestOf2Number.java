package interview.examples.programs;

import java.util.Scanner;

public class findGreatestOf2Number {
	public void greatestNumber(int number1,int number2) {
		if(number1 > number2) {
			System.out.println("number1 is greater : "+number1);
		}else {
			System.out.println("number2 is greater : "+number2);
			System.out.println();
		}
	}
	public void greatest3Number(int num1,int num2,int num3) {
		System.out.println("finding the greatest of 3 number");
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 is greater : "+num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("num2 is greater : "+num2);
		}else {
			System.out.println("num3 is greater : "+num3);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		findGreatestOf2Number find = new findGreatestOf2Number();
		find.greatestNumber(n1, n2);
		find.greatest3Number(n1, n2, n3);
	}

}
