package com.ecc.utility;

import java.util.Scanner;

import com.ecc.utility.CheckedFunction;

public class InputHandler {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static String getNextLine(String message) {
		System.out.print(message);
		return SCANNER.nextLine();		
	}
	public static <R> R getNextLine(String message, CheckedFunction<String, R> function) throws Exception {
		System.out.print(message);
		return function.apply(SCANNER.nextLine());		
	}
}