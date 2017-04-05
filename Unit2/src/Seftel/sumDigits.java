package Seftel;

import java.util.Scanner;

public class sumDigits {
	public static int findSum(int num){
		int total=0;
		while(total >0){
			total = total + total%10;
			num = num/10;
		}
		return total;
		
		
		
		
		
		
		
	}
	public static void main(String[]args){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = findSum(num);
		System.out.println("the sum of your number is"+total);
		
		
	}

}



