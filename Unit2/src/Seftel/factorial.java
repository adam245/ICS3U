package Seftel;

import java.util.Scanner;
/**
 * Factorial program.java
 * THis program takes the entered number and factors it down
 * @author Adam Seftel
 *05/04/2017
 */


public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		int total = getFactorial (x);
		System.out.println(x +"! is :"+ total );
	}

	/**
	 * this method takes the number and reduces it while multiplying
	 * x is the number entered
	 * total is the total of the factors
	 */
	public static int getFactorial(int x) {
		int total=1;

		for (int i = 1; i <= x; i++) {
			total = total*i;		
		}
		return total;
	}


}
