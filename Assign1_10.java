package assignments;
import java.util.*;


// Write a program in Java to display the n terms of odd natural number and their sum.
public class Assign1_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter one number: ");
		int num = s.nextInt();
		int oddSum = 0,odd=1;
		while(num>0) {
			System.out.print(odd+" ");
			oddSum += odd;
			odd += 2;
			num--;
			
		}
		System.out.println("\nSum = "+oddSum);
		
		
		
		s.close();

	}

}
