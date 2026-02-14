package midtermlab_activity;

import java.util.Scanner;

public class Zoe_midterm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//Product information
		String[] products = {"Iphone 15 Pro Max", "Samsung S23 Ultra", "RealMe X50"}; 
		double[] prices = {75000.00, 76000.00, 35000.00};
		//entering the products and prices
		 System.out.print("Enter Product 1: ");
	     System.out.println("\n Enter Price: ");
	     System.out.println();
	     
	     System.out.print("Enter Product 2: ");
	     System.out.println("\n Enter Price: ");
	     System.out.println();
	     
	     System.out.print("Enter Product 3: ");
	     System.out.println("\n Enter Price: ");
	     System.out.println();
	     
	     //input mode of payment terms
	     System.out.print("Cash Discount: ");
	     System.out.println("\n\t You input 10.00% Discount For Cash");
	     System.out.println();
	     
	     System.out.print("3 Months Installment: ");
	     System.out.println("\n\t You input 5.00% Interest for 3 Months Installment");
	     System.out.println();
	     
	     System.out.print("6 Months Installment: ");
	     System.out.println("\n\t You input 10.00% Interest for 6 Months Installment");
	     System.out.println();
	     
	     System.out.print("12 Months Installment: ");
	     System.out.println("\n\t You input 20.00% Interest for 12 Months Installment");
	     System.out.println();
		
		//Displaying the Main Menu
		System.out.println("Main Menu: ");
		System.out.println("Press I/i: " + products[0] + "Price: $" + prices[0]);
		System.out.println("Press S/s: " + products[1] + "Price: $" + prices[1]);
		System.out.println("Press X/x: " + products[2] + "Price: $" + prices[2]);
		
		//product selection
		System.out.println("\n Enter your product choice (I/i, S/s, X/x): ");
		char choice = scanner.next().charAt(0);
		int productIndex = 0;
		
		switch (Character.toLowerCase(choice)) {
		case 'i':
			productIndex = 0;
			break;
		case 's':
			productIndex = 1;
			break;
		case 'x':
			productIndex = 2;
			break;
		default:
			System.out.println("Invalid choice!");
             return;
		}
		
		double price = prices[productIndex];
		System.out.println("You selected: " + products[productIndex] + "Price: $" + price);
		
		//Payment Terms
		System.out.println("\nInput Mode of Payment Terms: ");
		System.out.println("1. Cash Discount (10% discount) ");
		System.out.println("2. 3 Months Installment (5% interest) ");
		System.out.println("3. 6 Months Installment (10% interest) ");
		System.out.println("4. 12 Months Installment (20% interest) ");
		
		System.out.print("Choose your payment term (1-4): ");
		int paymentTerm = scanner.nextInt();
		double finalPrice = price;
		
		switch (paymentTerm) {
		case 1:
			finalPrice = price - (price * 0.10);
			System.out.println("Cash Discount Applied. Final Price: $" + finalPrice);
			break;
		case 2:
			finalPrice = price - (price * 0.05);
			System.out.println("3 Months Installment. Final Price: $" + finalPrice);
			break;
		case 3:
			finalPrice = price - (price * 0.10);
			System.out.println("6 Months Installment. Final Price: $" + finalPrice);
			break;
		case 4:
			finalPrice = price - (price * 0.20);
			System.out.println("12 Months Installment. Final Price: $" + finalPrice);
			break;
		default:
			System.out.println("Invalid payment term selected!");
			return;
		}
		
		scanner.close();
}



      public static void main1(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
    	  //Product Information
    	  String product = "Iphone 15 Pro Max";
    	  double price = 75000.00;
    	  
    	  //Display product details
    	  System.out.println("Enter Item: ");
    	  System.out.println("Product: " + product);
    	  System.out.println("Price: " + price);
    	  
    	  //Display payment options
    	  System.out.print("\nPress 1: Cash (10.00% Discount)");
    	  System.out.println("Press 2: 3 Months Installment (5.00% Interest)");
    	  System.out.println("Press 3: 6 Months Installment (10.00% Interest)");
    	  System.out.println("Press 4: 12 Months Installment (20.00% Interest)");
    	  
    	  //Get payment choice
    	  System.out.print("\nEnter Mode of Payment: ");
    	  int paymentChoice = scanner.nextInt();
    	  
    	  //Variables to hold discount. interest, total amount, and monthly amortizations
    	  double discount = 0, interest = 0, totalAmount = 0, monthlyAmortization = 0;
    	  
    	  // Calculate based on payment option
    	  switch (paymentChoice ) {
    	  case 1:
    		  discount = price * 0.10;
    		  totalAmount = price - discount;
    		  break;
    	  case 2:
    		  interest = price * 0.05;
    		  totalAmount = price + interest;
    		  monthlyAmortization = totalAmount / 3;
    		  break;
    	  case 3:
    		  interest = price * 0.10;
    		  totalAmount = price + interest;
    		  monthlyAmortization = totalAmount / 6;
    		  break;
    	  case 4:
    		  interest = price * 0.20;
    		  totalAmount = price + interest;
    		  monthlyAmortization = totalAmount / 12;
    		  break;
    	  default:
    		  System.out.println("Invalid payment option selected.");
    		  return;
    	  }
    	  
    	  // Display payment summary
    	  System.out.println("\nMode of Payment: " + getPaymentMode(paymentChoice));
    	  System.out.println("Price: $" + price);
    	  
    	  System.out.println("Interest: $" + interest);
    	       System.out.println("Total Amount: $" + totalAmount);
    	       System.out.println("Monthly Amortizations: $" + monthlyAmortization);
    	       
    	       scanner.close();
      }
      
          // Method to get payment mode description
      public static String getPaymentMode(int choice) {
    	  switch (choice) {
    	  case 1:
    		  return "Cash";
    	  case 2:
    		  return "3 Months Installment";
    	  case 3:
    		  return "6 Months Installment";
    	  case 4:
    		  return "12 Months Installment";
    	  default:
    		  return "Unknown";
    	  }
      }
}
