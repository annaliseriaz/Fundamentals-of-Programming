package arrays;
import java.util.Scanner;

public class MyOwnArrays {

	public static void main(String[] args) {
		Matrixdw();
	}
	
	public static void Matrixdw() {
		int rows = 3, cols = 3;
		int matrix[][] = {{1,2,3},{7,8,9},{6,5,4}}; 
		System.out.println("Matrix Input");
		printMatrix(matrix, rows, cols);
		System.out.println("Transposed Matrix");
		printTransposed(matrix, rows, cols);
	}
	
	public static void printMatrix(int[][] matrix, int rows, int cols) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(matrix[i][j] + "");
			}
			System.out.println();
		}
	}
	
	public static void printTransposed(int[][] matrix, int rows, int cols) {
		for (int f = 0; f < cols; f++) {
			for (int a = 0; a < rows; a++) {
				System.out.println(matrix[f][a] + "");
			}
			System.out.println();
		}
	}
	
	//--------------------------------------------------------------//
	
	private static void arrayngEabab() { 
		String[] eabab = {"Zoe","Meibelle","Kassandra", "Kristine"};
		System.out.println(eabab[0]);
		System.out.println(eabab[1]); 
		
	}
	
	private static void eababArray() { 
		Scanner eabab = new Scanner(System.in);
		String mgaEabab[] = {"Zoe" , "Meibelle", "Kassandra", "Kristine"};
		
		// input pangalan ng eabab //
		System.out.print("Enter name ng eabab: ");
		mgaEabab[0] = eabab.nextLine(); 
		
		System.out.println("Si " + mgaEabab[0] + " ay maganda at matalino"); 
		
		System.out.println("\nTherefore, si " + mgaEabab[0] + " ay babae:))");
	}
}
