package behavioral;

public class RedLight implements TrafficLightState {
	@Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Red Light: Stop");
        trafficLight.setState(new GreenLight());
	}
}
