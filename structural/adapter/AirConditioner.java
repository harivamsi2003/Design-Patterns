package adapter;

public class AirConditioner {
	public void connectViaBluetooth() {
		System.out.println("Connected Via Bluettooth");
	}
	
	public void startCooling() {
		System.out.println("AC started Cooling");
	}
	
	public void stopCooling() {
		System.out.println("AC stopped cooling");
	}
	
	public void disconnectViaBluetooth() {
		System.out.println("Disconnected bluetooth for AC");
	}
}
