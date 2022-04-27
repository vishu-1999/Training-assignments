package assignments;
import java.util.*;

//Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer

public class Assign1_4 {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		System.out.println("Enter one integer value between 0 and 1000");
		int num = s.nextInt();
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
		
		s.close();
	}

}
