package com.app;

import java.util.Scanner;

public class ReverseNumForLoop {

	public static void main(String[] args) {
	
		int num = 0;
		int reversenum = 0;
		
		System.out.println("Enter the number and press enter:-");
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		while(num!=0){
			reversenum = reversenum*10;
			reversenum = reversenum+num%10;
			num = num/10;
		}
		System.out.println("reverse number is :-" +reversenum);
	}
}
