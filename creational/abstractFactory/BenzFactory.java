package abstractFactory;

public class BenzFactory implements VehicleFactory {
	public Vehicle createVehicle() {
		return new Benz();
	}
}
