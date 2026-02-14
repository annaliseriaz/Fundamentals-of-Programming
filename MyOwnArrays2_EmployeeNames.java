package arrays;
import java.util.Scanner;
import java.util.*;
public class MyOwnArrays2_EmployeeNames {

	public static void main(String[] args) {
		array();
	}
	
	public static void array() {
		String range[] = {"Zoe", "Kristine", "Kassandra","Meibelle", "Graziella","Kazleen"};
		for (int r = 0; r < 5; r++) {
			System.out.println("ang mga pangalan ng mga eabab na itu ay sina " + range);
		}
	}
	
	public static void EmployeeNames() {
		Scanner nameofEmployees = new Scanner(System.in);
		String[] employeeNames = {"Hope", "Elizabeth", "Venus", "Nale", "Kaylee"};
		String positionofEmployees[] = {"Manager", "Employee", "Supervisor", "Chief Executive Officer", "Staff"};
		
		//enter employee name & position//
		System.out.print("Enter employee name : ");
		employeeNames[0] = nameofEmployees.nextLine();	
		
		System.out.print("Enter position      : ");
		positionofEmployees[0] = nameofEmployees.nextLine();
		
		//displaying the employee name & position// 
		System.out.println(employeeNames[0] + " your position is " + positionofEmployees[3]); 
	}
}
