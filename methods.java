package methodsquizandsimulations;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		int edad = calculateAge(2024,2005);
		System.out.println(edad + " kana boss tanda mo na shuta");
	}
	
	//calculating age mo baka mabati kita ng happy birthday//
	private static int calculateAge(int num1, int num2) { 
		return num1 - num2;
	} 
	
	public static void ArrayCabinet() {
		String[] cabinet = new String[4];
		cabinet[0] = "socks";
		cabinet[1] = "underwear";
		cabinet[2] = "shirts";
		cabinet[3] = "dresser";
		
		System.out.println("The contents of the cabinet are: ");
		
		for (int i = 0; i < cabinet.length; i++) {
			System.out.println(cabinet[i]);
		}
	}
	
	public static void Breakdw() {
		for (int i = 0; i < 100; i+= 3) {
			if (i > 21) {
				break; 
			}
			System.out.println(i);
		}
	}
}
