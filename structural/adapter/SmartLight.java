package adapter;

public class SmartLight {
	public void connectWiFi() {
		System.out.println("Smart Light connected Via wifi");
	}
	
	public void switchOn() {
		System.out.println("Light is on");
	}
	
	public void switchoff() {
		System.out.println("Light is off");
	}
	
	public void disconnectWiFi() {
		System.out.println("Wifi disonnected for Smart Light");
	}
}
