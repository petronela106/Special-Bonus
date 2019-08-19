package specialBonus;

import java.util.Scanner;

//Write a program to apply a 20% bonus for certain number:
//Read an integer from the console: the "stop number"
//Keep reading integers until it finds the stop number
//When the stop number is found, increase the value of the previous number before it with 20% and print it

   public class SpecialBonus {
	   private static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    int stopNumber = scanner.nextInt();
	    int number = scanner.nextInt();
	       int n = 0;
	    while(number != stopNumber ){
	       n = number;
	       int num = scanner.nextInt();
	       number = num;
	    }
	    double result = n + (n * 0.2);
	    System.out.printf("%.0f",result);
	    }
	}