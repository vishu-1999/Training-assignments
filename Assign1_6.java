package assignments;
import java.util.*;

// Write java program to get a number from the user and print whether it is positive or negative 
public class Assign1_6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = s.nextInt();
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
		s.close();
	}

}
