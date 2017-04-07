package Seftel;
import java.util.Scanner;
public class backwardSentence {
	/**
	 * backwardSentence.java
	 * This program takes an inputed sentence and outputs it backwards.
	 * @Author Adam Seftel
	 * 07/04/2017
	 */
	
	
	
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		
		System.out.println("Please enter a sentence.");
		String [] sentence = sc.nextLine().split(" ");
		for(int i=0; i< sentence.length; i++){
			for(int r = sentence[i].length()-1; r>=0; r--){
				System.out.print(sentence[i].charAt(r));
			}
			System.out.print(" ");
		}
	}
}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               


