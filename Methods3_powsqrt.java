package lessoncodesnisir;
import java.util.Scanner; 
public class Methods3_powsqrt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num;
		num=scan.nextInt();
		System.out.println("The Power value is "+ Math.pow(num, 2));
		System.out.println("The Squareroot value is "+ Math.pow(num, 3));
		
		System.out.println("The Power value is "+ Math.pow(sqr(2),Math.sqrt(9)));
	}
	static int sqr(int x)
	{
		int s;
		s=x*x;
		return s;
	}
}
