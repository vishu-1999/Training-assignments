package assignments;
import java.util.*;


// Take three numbers from the user and print the greatest number 
public class Assign1_7 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers : ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1);
			}
			else {
				System.out.println(num3);
			}
		}
		else {
			if(num2>num3) {
				System.out.println(num2);
			}
			else {
				System.out.println(num3);
			}
		}
		s.close();
	}

}
