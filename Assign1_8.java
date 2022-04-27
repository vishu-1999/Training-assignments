package assignments;
import java.util.*;


// Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and 
// displays the name of the weekday. 
public class Assign1_8 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7 : ");
		int num = s.nextInt();
		switch(num) {
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default:System.out.println("Enter correct choice");
		}
		s.close();
	}

}
