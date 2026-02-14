package midtermlab_activity;
import java.util.Scanner;
import java.util.ArrayList;
public class Zoe2_midterm {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        // Input number of elements
		        System.out.print("Enter Number: ");
		        int n = sc.nextInt();
		        
		        // Array to store elements
		        int[] arr = new int[n];
		        
		        System.out.print("Enter the elements: ");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Step 1: Reverse order of even numbers
		        ArrayList<Integer> evenNumbers = new ArrayList<>();
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % 2 == 0) {
		                evenNumbers.add(arr[i]);
		            }
		        }
		        
		        System.out.print("Even number in reverse order: ");
		        for (int i = evenNumbers.size() - 1; i >= 0; i--) {
		            System.out.print(evenNumbers.get(i) + " ");
		        }
		        System.out.println();

		        // Step 2: Alternate and reverse order logic
		        System.out.print("Alternate and reverse order: ");
		        
		        // First alternate: Reverse the entire sequence, alternate elements
		        for (int i = n - 1; i >= 0; i -= 2) {
		            System.out.print(arr[i] + " ");
		        }
		        
		        // Then: Take remaining elements and print them in order
		        for (int i = (n % 2 == 0 ? 1 : 0); i < n; i += 2) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();

		        sc.close();
		    }
}
