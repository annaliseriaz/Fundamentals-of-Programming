package lessoncodesnisir;
import java.util.Scanner; 
public class Sampleloop3 {

	public static void main(String[] args) {
		Scanner sirmarc = new Scanner(System.in);
		int hs = 10, row = 1, nh;
		while (row <= hs)
		{
			for (nh = 1; nh <= hs; nh++)
			{
				int mul = nh*row;
				System.out.print(mul + "\t");
			}
			System.out.println();
			row++; 
		}
	}
}
