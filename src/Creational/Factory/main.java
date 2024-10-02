package Creational.Factory;
import java.util.Scanner;
public class main {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter pizza type (Margherita,  Veggie): ");
	        String pizzaType = scanner.nextLine();

	        Pizza pizza = PizaaFactory.createPizza(pizzaType);
	        pizza.prepare();

	        scanner.close();
	    }
	}
