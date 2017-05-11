package Seftel;

import java.util.Scanner;
/**
 * perfectSquare.java
 * This program check every number from 1 t0 100 and then outputs every number
 * @author Adam Seftel
 *05/04/2017
 */
public class perfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i= 1; i<100;i++){
			for(int a= 1; a < 100; a++){
				if(perfectSquare(num)==true){
					
					int sum = a + b;
				}
			}
		}
	}
	public static boolean perfectSquare(int num){
		Scanner sc = new Scanner(System.in);
		double sqrt = Math.sqrt(num);
		double check = Math.pow(sqrt,2);
		if(num==check){
			return true;
		}
		return false;
	}
	

}