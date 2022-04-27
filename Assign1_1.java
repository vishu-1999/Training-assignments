package assignments;
import java.util.*;


// Write a Java program that accepts four integer from the user and prints equal if all four are equal, and 
// not equal otherwise.
public class Assign1_1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 4 numbers: ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		if(a==b && b==c && c==d) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

		s.close();
	}

}
