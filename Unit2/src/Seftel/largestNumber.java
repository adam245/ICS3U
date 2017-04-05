package Seftel;

import java.util.Scanner;
/**
 * largestNumber program.java
 *this program determine the largest number entered in an array
 * @author Adam Seftel
 *05/04/2017
 */
public class largestNumber {
/** 
 * this method checks the array and finds the highest number	
 * once the highest number is fouudn it is returned in the variable maxNum
 * @return
 */
public static int getLargest(int[]numbers){
		
		int maxNum = numbers [0];
		for ( int i = 1; i<numbers.length; i++){
			maxNum = Math.max (maxNum, numbers[i]);
			
		}
		
		return maxNum;
		
		
	}
		public static void main(String[]arg){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many numbers do you want to enter?");
			int numbers = sc.nextInt();
			int maxNum[] = new int[numbers];
			System.out.println("Enter your numbers");
			for(int i =0; i < numbers; i++){
				maxNum[i] = sc.nextInt();
			}
			
			System.out.println("The highest number you entered is " +getLargest(maxNum));
			
		}
		
	}

