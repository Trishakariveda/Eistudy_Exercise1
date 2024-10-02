package behavioral.observer;

public class Main2 {

	public static void main(String[] args) {
		FitnessTracker tracker = new FitnessTracker();
        
        SmartWatch appleWatch = new SmartWatch("Apple");
        SmartWatch samsungWatch = new SmartWatch("Samsung");

        tracker.addDevice(appleWatch);
        tracker.addDevice(samsungWatch);

        tracker.setStepCount(5000);
        tracker.setStepCount(10000); 
	}

}
