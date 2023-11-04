//Created by: Edward Mankiewicz
//Created on: October 30, 2023
//Purpose: To show basic understanding / progress of functional programming

package introToFuncProgramming;

import java.util.Scanner;

public class BasicFunctions {
		
	static Scanner input = new Scanner(System.in);

	public static String password(Scanner input) { //allows input of password in while statement later
		return input.nextLine();
	}
		
	public static boolean noSpaces(String s) { //No spaces allowed in password
		return !s.contains(" ");
	}
		
	public static void isComplexPassword(String s, Scanner input) {
		while(true) {
			boolean correct = 
				s.length()>5&&
				s.chars().anyMatch(Character::isUpperCase)&& //Look for 1 uppercase
				s.chars().anyMatch(Character::isLowerCase)&& //Look for 1 lowercase					s.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch))&& //Look for 1 special character
				s.chars().anyMatch(Character::isDigit); ////Look for 1 number
			if (correct ==true&&noSpaces(s)==true) {
				System.out.println(s + " is a valid password");
				break;
			}
			else {
				System.out.println(s + " is NOT a valid password");
				System.out.println("Please enter a valid password");
				s=password(input);
				}
			}	
		}
		
	public static void main (String[] args) {
		System.out.println("Create password with at least one uppercase, lowercase, digit, and special character.");
		System.out.println("NO SPACES ALLOWED!");
		String password = password(input);
		isComplexPassword(password, input);
	}
}
