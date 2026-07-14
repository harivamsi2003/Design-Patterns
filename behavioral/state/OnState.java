package state;

public class OnState implements State {
	@Override
	public void pressSwitch(Light light) {
		System.out.println("Light is OFF");
		light.setState(new OffState());
	}
}
