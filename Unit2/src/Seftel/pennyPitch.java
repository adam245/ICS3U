package Seftel;

import java.util.Scanner;

public class pennyPitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int [][] grid = new int [5][5];
		
		 for(int i= 0; i<grid.length; i++){
		 for(int j=0; j<grid[i].length; j++){
		 grid[i][j]=0;
		 }
		 }
		
		 int Puzzle;
		 int Doll;
		 int ball;
		 int poster;
		 int game;
		
		 for(int i=0;i<grid.length; i++){
		 for(int j=0; j<grid[i].length; j++){
		 System.out.print(grid[i][j] +" ");
		 }
		 System.out.println();
		 }

		
		String[] prizes = new String[] { "DOLL  ", "POSTER", "BALL  ", "PUZZLE", "GAME  " };
		String[] prizesOnBoard = new String[15];

		int puzzle = 0, doll = 0, ball = 0, poster = 0, game = 0;

		for (int i = 1; i <= 25; i++) {
			
//			System.out.print(prizes[i]);
			
		
		
			
			prizesOnBoard[i-1] = prizes[i];
			
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}

	public static int getRandomNumber() {
		return (int) (Math.random() * 3) + 1;
	}

	public static boolean hasThreePrizes(String[] arr, String prize) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(prize)) {
				counter++;
			}
		}
		return counter > 3;
	}
}
