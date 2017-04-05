package Seftel;
import java.util.Scanner;
/**
 * isprime program.java
 * this program finds out if the number entered is a prime number
 * @author Adam Seftel
 *05/04/2017
 */
public class isPrime {
	/**
	 * this method determines is the number is a prime 
	 * num, is the number entered
	 */
	public static boolean getPrime(int num){
	for(int i =2; i<num/2;i++){
			if(num%i==0){
				return false;
			}
			
				
		}
		return true;
		
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = sc.nextInt();
		if(getPrime(num)==true){
			System.out.println("The number you have entered is a prime number");
		}
		else{
			System.out.println("The number you have entered is not a prime numbers");
		}
		
		
	}
	/**
	 * this method is the divisible method
	 * if the number is divisible it will return true
	 */
	public static boolean isDivisible(int a,int b){
		if(a%b==0){
			return true;
			
		}
		return false;
	}

}
