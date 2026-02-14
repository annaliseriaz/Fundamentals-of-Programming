package finalslab_activity;
import java.util.Scanner;
public class Zoe_final_activity2 {

	public static void main(String[] args) {
		Scanner methodthod = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		long mahaba = methodthod.nextLong();
		
		long reverseNum = reverseNumber(mahaba);
		System.out.println("Reverse Order: " + reverseNum);
	}
	
	public static long reverseNumber(long num) {
		long reversedlang = 0;
		while (num != 0) {
			reversedlang = reversedlang * 10 + num % 10;
			num /=10;
		}
		return reversedlang; 
	}
}
