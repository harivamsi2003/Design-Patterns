package abstractFactory;

public class KiaFactory implements VehicleFactory {
	public Vehicle createVehicle() {
		return new Kia();
	}
}
