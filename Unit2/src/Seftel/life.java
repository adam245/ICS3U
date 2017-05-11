package Seftel;
import java.util.Scanner;

/**
 * GameOfLife.java
 * This program is a replication of the game of
 *  life and is played in a grid. A player enters life cells and depending on the cells around it the cell will either die of survive till the next day. the user plays until all the cells are dead 
 * @author Adam Seftel
 */

public class life {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many living cells would you like to have?");
		int[][] grid = new int[20][20];
		int aliveCells = sc.nextInt();
		
		
		for (int i = 0; i < aliveCells; i++) {
			System.out.println("Please enter the coordinates of the cell (X Y)");
			int x = sc.nextInt();
			int y = sc.nextInt();
			grid[x][y] = 1;

		}
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j]);
				
			}
			System.out.println();
		}
		
		int count = 0;
		boolean next = true;
		int allAlive = aliveCells;
		for (int day = 1; next == true&&allAlive !=0; day++) {
			int[][] nextWorld = new int [20][20];
			for(int i = 0; i < 20; i ++){
				for(int j = 0; j < 20; j ++){
					nextWorld[i][j] = 0;
				}
			}
			
			System.out.println("Would you like to go to the next day? (Yes or No)");
			next = sc.nextBoolean();
			count=0;
			for (int i = 0; i < grid.length; i++) {
				count=0;
				for (int j = 0; j < grid[i].length; j++) {


					if (grid[i][j] == 1) {
						
						if (grid[i].length > j + 1) {
							if (grid[i][j + 1] == 1) {
								count++;
							}
						}
						if (grid[i].length > j - 1 && j - 1 >= 0) {
							if (grid[i][j - 1] == 1) {
								count++;
							}
						}
						if (grid.length > i - 1 && i - 1 >= 0) {
							if (grid[i - 1][j] == 1) {
								count++;
							}
						}
						if (grid.length > i + 1) {
							if (grid[i + 1][j] == 1) {
								count++;
							}
						}
						if (grid.length > i - 1 && grid[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
							if (grid[i - 1][j - 1] == 1) {
								count++;
							}
						}
						if (grid.length > i - 1 && grid[i].length > j + 1 && i - 1 >= 0) {
							if (grid[i - 1][j + 1] == 1) {
								count++;
							}
						}

						if (grid.length > i + 1 && grid[i].length > j - 1 && j - 1 >= 0) {
							if (grid[i + 1][j - 1] == 1) {
								count++;
							}
						}

						if (grid.length > i + 1 && grid[i].length > j + 1) {
							if (grid[i + 1][j + 1] == 1) {
								count++;
							}
						}
						if (count == 2 || count == 3) {
							nextWorld[i][j] = 1;
						} else if (count == 1 || count == 4 || count == 5 || count == 6 || count == 7|| count == 8) {//If the cell did not have 2 or 3 living neighbours it dies
							nextWorld[i][j] = 0;
							allAlive--;
						}

						count=0;

					} else if (grid[i][j] == 0) {

						count=0;
						
						if (grid[i].length > j + 1) {
							if (grid[i][j + 1] == 1) {
								count++;
							}
						}
						if (grid[i].length > j - 1 && j - 1 >= 0) {
							if (grid[i][j - 1] == 1) {
								count++;
							}
						}
						if (grid.length > i - 1 && i - 1 >= 0) {
							if (grid[i - 1][j] == 1) {
								count++;
							}
						}
						if (grid.length > i + 1) {
							if (grid[i + 1][j] == 1) {
								count++;
							}
						}
						if (grid.length > i - 1 && grid[i].length > j - 1 && i - 1 >= 0 && j - 1 >= 0) {
							if (grid[i - 1][j - 1] == 1) {
								count++;
							}
						}
						if (grid.length > i - 1 && grid[i].length > j + 1 && i - 1 >= 0) {
							if (grid[i - 1][j + 1] == 1) {
								count++;
							}
						}
						if (grid.length > i + 1 && grid[i].length > j - 1 && j - 1 >= 0) {
							if (grid[i + 1][j - 1] == 1) {
								count++;
							}
						}
						if (grid.length > i + 1 && grid[i].length > j + 1) {
							if (grid[i + 1][j + 1] == 1) {
								count++;
							}
						}
						if (count == 3) {
							nextWorld[i][j] = 1;
							allAlive++;
						}
						else if (count == 1 || count == 2 || count == 4 || count == 5 || count == 6|| count == 7 || count == 8) {
							nextWorld[i][j] = 0;
						}

						count=0;
					}
				}
			}
			grid = nextWorld;
			for(int i = 0; i < 20; i++){
				for (int j = 0; j < 20; j++){
					System.out.print(nextWorld[i][j]);
				}
				System.out.println();
			}
			if(allAlive==0){
				System.out.println(" GAME OVER.");
			}
		}
	}
}


