package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {
	private List<Device> devices = new ArrayList<>();
    private int stepCount;

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void setStepCount(int steps) {
        this.stepCount = steps;
        if (stepCount >= 10000) {
            notifyDevices("Congratulations! You've reached 10,000 steps!");
        }
    }

    private void notifyDevices(String message) {
        for (Device device : devices) {
            device.update(message);
        }
    }
}
