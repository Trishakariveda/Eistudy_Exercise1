package behavioral;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ShoppingCart cart = new ShoppingCart();

	        System.out.print("Enter the amount for Credit Card Payment: ");
	        double creditCardAmount = scanner.nextDouble();
	        cart.setPaymentStrategy(new CreditCardPayment());
	        cart.checkout(creditCardAmount);

	        System.out.print("Enter the amount for PayPal Payment: ");
	        double payPalAmount = scanner.nextDouble();
	        cart.setPaymentStrategy(new PayPalPayment());
	        cart.checkout(payPalAmount);
	        
	        scanner.close(); // Close the scanner
	    }
	}