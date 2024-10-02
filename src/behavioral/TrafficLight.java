package behavioral;

public class TrafficLight {
	private TrafficLightState state;

    public TrafficLight() {
        state = new RedLight();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change() {
        state.changeState(this);
    }
}