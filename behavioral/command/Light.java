package command;

public class Light {
	private String Location;
	
	public Light(String Location) {
		this.Location=Location;
	}
	
	public void turnOn() {
		System.out.println("Light in location: "+this.Location+" turned On.");
	}
	
	public void turnOff() {
		System.out.println("Light in location: "+this.Location+" turned Off.");
	}
}
