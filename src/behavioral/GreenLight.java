package behavioral;

public class GreenLight implements TrafficLightState{
	 @Override
	    public void changeState(TrafficLight trafficLight) {
	        System.out.println("Green Light: Go");
	        trafficLight.setState(new YellowLight());
	    }

}
