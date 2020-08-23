package util;

import java.util.Scanner;

public class MyScanner {

	private static Scanner myScanner;
	static {
		Scanner myScanner = new Scanner(System.in);

	}

	public static String readString() {
		return myScanner.nextLine();
		
	}
}