package behavioral.observer;

public class SmartWatch implements Device {
	private String brand;

    public SmartWatch(String brand) {
        this.brand = brand;
    }

    @Override
    public void update(String message) {
        System.out.println(brand + " Smartwatch: " + message);
    }

}
