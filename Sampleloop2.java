package lessoncodesnisir;
import java.util.Scanner;
// import java.text.DecimalFormat; 
public class Sampleloop2 {

	public static void main(String[] args) {
		// declaration of variables
		Scanner sirmarcwelabyu = new Scanner(System.in);//instantiation
		System.out.print("Enter number of rows: "); 
		int rows = sirmarcwelabyu.nextInt();
		
		for (int i = 1; i <= rows; i++)
		{
			for (int x = 1; x <= i; x++)
			{
				System.out.print(x);
			}
			System.out.println();
		}
	}
} 
