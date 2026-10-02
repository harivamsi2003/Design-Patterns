package composite;

public class AirConditioner implements SmartComponent {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Air Conditioner turned ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Air Conditioned turned OFF");
	}

}
