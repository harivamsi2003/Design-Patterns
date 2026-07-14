package state;

public class OffState implements State {

	@Override
	public void pressSwitch(Light light) {
		// TODO Auto-generated method stub
		System.out.println("Light is ON");
		light.setState(new OnState());
	}

}
