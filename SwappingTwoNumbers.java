package interview.examples.programs;

public class SwappingTwoNumbers {
	public static void numberSwapping(int num1,int num2) {
		int temp;
		System.out.println("Before swapping : "+num1+","+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping : "+num1+","+num2);
	}
	
	public static void stringSwapping(String str1, String str2) {
		String temp = " ";
		System.out.println("Before swapping : "+str1+","+str2);
		
		temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("After swapping : "+str1+","+str2);
	}
}
