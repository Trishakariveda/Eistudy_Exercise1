package structural.Decorator;

public class Main1 {
	    public static void main(String[] args) {
	        Coffee coffee = new BasicCoffee();
	        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

	        coffee = new MilkDecorator(coffee);
	        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
	    }
	}
