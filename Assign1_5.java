package assignments;
import java.util.*;
import java.lang.Math;



// Write a Java program that accepts two integers from the user and then prints the sum, the difference,
// the product, the average, the distance (the difference between integer), the maximum (the larger of the 
// two integers), the minimum (smaller of the two integers).
public class Assign1_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		System.out.println("Sum = "+ (num1+num2));
		System.out.println("Difference = "+ (num1-num2));
		System.out.println("Product = "+ (num1*num2));
		System.out.println("Average = "+ (num1+num2)/2);
		System.out.println("Distance = "+ Math.abs(num1-num2));
		System.out.println("Maximun = "+ ((num1>num2)?num1:num2));
		System.out.println("Minimum = "+ ((num1<num2)?num1:num2));
		s.close();
	}

}
