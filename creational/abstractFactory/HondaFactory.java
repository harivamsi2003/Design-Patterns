package abstractFactory;

public class HondaFactory implements VehicleFactory {
	public Vehicle createVehicle() {
		return new Honda();
	}
}
