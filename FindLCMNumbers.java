package interview.examples.programs;

import java.util.Scanner;

public class FindLCMNumbers {
	public static void findLCM(int num1,int num2) {
		int lcm;
		
		lcm = (num1 > num2) ? num1 : num2;
		
		int flag = 1;
		while (flag == 1) {
			if (lcm % num1 == 0 && lcm % num2 == 0) {
				System.out.printf("The LCM of num1 and num2 is : "+lcm);
				flag = 0;
				break;
			}
			++lcm;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the two number num1 & num2");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		findLCM(num1, num2);
	}

}
