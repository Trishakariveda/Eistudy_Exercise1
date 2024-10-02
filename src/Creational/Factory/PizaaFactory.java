package Creational.Factory;

public class PizaaFactory {
	public static Pizza createPizza(String type) {
        switch (type) {
            case "Margherita":
                return new MargheritaPizza();
            case "Veggie":
                return new VeggiePizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
