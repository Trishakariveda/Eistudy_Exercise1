package behavioral;

public class YellowLight implements TrafficLightState {
	@Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("Yellow Light: Prepare to stop");
        trafficLight.setState(new RedLight());
    }

}
