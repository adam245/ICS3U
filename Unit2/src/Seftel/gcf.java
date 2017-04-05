package Seftel;

import java.util.Scanner;
/**
 * Greatestcommonfactor program.java
 * this program finds the greatest common factor between two numbers.
 * @author Adam Seftel
 *05/04/2017
 */
public class gcf {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number");
		int number1 = sc.nextInt();
		System.out.println("Enter your second number");
		int number2 = sc.nextInt();
		System.out.println("The greatest common factor of bewteen the numbers entered is " +Gcf(number1, number2));
		
	}
	
	
	
	public static int Gcf(int number1, int number2){
		if(number1 > number2){
			for(int i = number1; i>0; i--){
				if(isDivisible(number1,i)==true&& isDivisible(number2,i)==true){
					return i;
				}
			}
		}
	}
	
	if(number2 > number1){
		int number1;
		int number2;
		for(int i = number1; i>0; i--){
			if(isDivisible(number1,i)==true&& isDivisible(number2,i)==true){
				return i;
			}
		}
	}
	return number1;

}
public static boolean isDivisible(int a,int b){
if(a%b==0){
	return true;
}
return false;
}
	
	
	
	
			

	
		
				


			
		
		
