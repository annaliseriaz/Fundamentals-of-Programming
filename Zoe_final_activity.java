package finalslab_activity; 
import java.util.Scanner;
public class Zoe_final_activity {

	public static void main(String[] args) {
		Scanner piteee = new Scanner(System.in);

		// enter any number
        System.out.print("Enter Number: ");
        int num = piteee.nextInt();
        System.out.print("(");
        for (int a = 1; a <= num; a++) { 
            System.out.print( a + " ");
        }
        System.out.print(") ");
        for (int a = num; a>= 1; a--) {
            System.out.print(a);
        }
        System.out.println();
        System.out.print("Reverse order of even numbers: ");
        for (int a = num; a >= 1; a--) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
        System.out.print("Alternate and reverse order: ");
        for (int a = num, b = 1; a >= 1 && b <= num; a--, b++) {
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
	}
}
