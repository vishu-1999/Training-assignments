package assignments;
import java.util.*;

// Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or 
// Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is 
// a string of length > 1, print an error message. 
public class Assign1_9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ch = s.next();
		if(ch.length()>1) {
			System.out.println("Error! enter a character!!");
		}
		else {
			boolean upperCase = ch.charAt(0)>=65 && ch.charAt(0)<=90;
			boolean lowerCase = ch.charAt(0)>=97 && ch.charAt(0)<=122;
			if(upperCase) {
				if(ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")) {
					System.out.println("Vowel");
				}
				else {
					System.out.println("Consonant");
				}
			}
			else if(lowerCase) {
				if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
					System.out.println("Vowel");
				}
				else {
					System.out.println("Consonant");
				}
			}
			else {
				System.out.println("Error!! Not a character....");
			}
		}
		
		s.close();
		

	}

}
