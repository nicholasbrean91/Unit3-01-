//Created by: Nicholas
//Created on: November 2018
//This program Reverses strings

import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter any string you want to be reversed: ");
		Scanner userInput = new Scanner(System.in);
		
		if(userInput.hasNextLine()) {
			String user = userInput.nextLine();
			String reverse = Reverse(user);
			System.out.println("The reverse string is " + reverse + "\n");
		}else {
			System.out.println("Errors");
		}
	}
	
	public static String Reverse (String sentence) {
		
		String theSentenceSubString;		
		char lastCharacterOfString;
		
		if (sentence.length() > 0 ) {
			theSentenceSubString = sentence.substring(0,sentence.length() - 1);
			Reverse(theSentenceSubString);
			
			lastCharacterOfString =	sentence.charAt(sentence.length() - 1);
			String textReverse = lastCharacterOfString + Reverse(theSentenceSubString);
			
			return textReverse;
			
		}else {
			
			return sentence;
		}
		
	}

}
