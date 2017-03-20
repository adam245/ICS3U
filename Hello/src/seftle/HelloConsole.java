package seftle;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		int number;
		c.println("Enter a number");
		number = c.readInt();
		c.println("You entered the number " + number);
		}

	}

