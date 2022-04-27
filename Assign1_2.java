package assignments;
import java.util.*;

//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false
//otherwise.

public class Assign1_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two double values : ");
		double num1 = s.nextDouble();
		double num2 = s.nextDouble();
		if((num1>0 && num1<1) &&(num2>0 && num2<1)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		s.close();
	}

}
