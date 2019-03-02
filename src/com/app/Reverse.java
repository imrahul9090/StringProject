package com.app;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String :-");
		str = scan.nextLine();
		
		char[] ch = str.toCharArray();
		System.out.println("Reverse number is :-");
		
		for(int i = ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}
}
