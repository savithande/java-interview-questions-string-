package interview.examples.programs;

import java.util.Scanner;

public class AreaOfCircle {
	public static void area(int radius) {
		int area;
		
		area = (int) (3.142 * radius * radius);
		
		System.out.println(area);
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius of the circle : ");
		int r = scan.nextInt();
		area(r);
	}

}
