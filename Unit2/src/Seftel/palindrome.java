package Seftel;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word");
	String word = sc.nextLine();
	if(isPalindrome(word)){
		System.out.println(word +" is a palindrome.");
	}
	else{
		System.out.println(word + " is not a palindrome.");
	}
	

}

public static boolean isPalindrome(String word){
	String back = " ";
	for(int i=  word.length()-1; i >= 0; i++){
		back = back + word.charAt(i);	
}
	if(back.equalsIgnoreCase(word)){
		return true;
}
	return false;
}
}

