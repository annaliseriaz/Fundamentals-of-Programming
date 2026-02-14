package finalslab_activity;
import java.util.Scanner;
public class ZoeLoop {

	public static void main(String[] args) {
		Scanner juswa = new Scanner(System.in);
		System.out.print("Enter number: ");
		int oweey = juswa.nextInt();
		
		for (int row = oweey - 1; row >= 0; row--)
		{
			for (int col = 0; col < oweey; col++)
			{
				int shuta = (row % 2 == 0)
						? (row * oweey + col + 1)
						: ((row +1) * oweey -col);
				System.out.printf("%3d", shuta);
			}
			System.out.println(); 
		}
	}
}
