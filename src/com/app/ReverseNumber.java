package com.app;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number");
		original = scan.nextLine();

		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		System.out.print("reverse of string :" + reverse);
	}
}
