package Seftel;

import java.util.Scanner;
/**
 * sumDigits program.java
 * this program and up the digits of a number
 * @author Adam Seftel
 *05/04/2017
 */
public class sumDigits {
	/** 
	 * this method takes the numbers and finds the sum
	 * num is the number entered
	 * when the total is found it is returned
	 */
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



