package abstractFactory;

public class Honda implements Vehicle {
	public void start() {
		System.out.println("Honda vehicle is starting");
	}
	
	public void stop() {
		System.out.println("Honda vehicle is stopping");
	}
}
