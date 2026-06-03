package factory;

public class Factory {
	
	//Factory Design: Handles object creation in a centralized manner.
	//If you want any object, then say it to factory and then it will create it for you.
	//It is more flexible and organized.
	//No more repeat of logic.
	//Consider an example of real-world factory of vehicles etc.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Can create any type of vehicle through vehicle factory instead of manually instantiating every type of vehicle.
		//Best for applications which need to create variety of objects in a flexible and scalable way.
		
		Vehicle vehicle1 = VehicleFactory.getVehicle("Bike");
		vehicle1.start();
		vehicle1.stop();
		
		Vehicle vehicle2 = VehicleFactory.getVehicle("Car");
		vehicle2.start();
		vehicle2.stop();
		
		Vehicle vehicle3 = VehicleFactory.getVehicle("Truck");
		vehicle3.start();
		vehicle3.stop();
		
		Vehicle vehicle4 = VehicleFactory.getVehicle("Scooty");
		vehicle4.start();
		vehicle4.stop();
	}

}
