package adapter;

public class SmartLightAdapter implements SmartDevice {
	
	private SmartLight sl;
	
	public SmartLightAdapter(SmartLight sl) {
		this.sl=sl;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		sl.connectWiFi();
		sl.switchOn();
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		sl.switchoff();
		sl.disconnectWiFi();
	}

}
