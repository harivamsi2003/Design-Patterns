package adapter;

public class AirConditionerAdapter implements SmartDevice {
	private AirConditioner ac;
	
	public AirConditionerAdapter(AirConditioner ac) {
		this.ac=ac;
	}
	
	@Override
	public void turnOn() {
		ac.connectViaBluetooth();
		ac.startCooling();
	}
	
	@Override
	public void turnOff() {
		ac.stopCooling();
		ac.disconnectViaBluetooth();
	}
}
