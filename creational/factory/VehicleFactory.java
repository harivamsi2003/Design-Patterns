package factory;

public class VehicleFactory {
	//If you want any new vehicle, we can just modify here and add new class.
	public static Vehicle getVehicle(String type) {
		if(type.equals("Car")) {
			return new Car();
		}
		else if(type.equals("Truck")) {
			return new Truck();
		}
		else if(type.equals("Bike")) {
			return new Bike();
		}
		else {
			throw new IllegalArgumentException("Unknown vehicle...!!!");
		}
	}
}
