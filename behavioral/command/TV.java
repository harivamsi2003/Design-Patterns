package command;

public class TV {
	private String Location;
	
	public TV(String Location) {
		this.Location=Location;
	}
	
	public void turnOn() {
		System.out.println("TV in location: "+this.Location+" turned On.");
	}
	
	public void turnOff() {
		System.out.println("TV in location: "+this.Location+" turned Off.");
	}
}
