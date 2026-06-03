package abstractFactory;

public class AbstractFactory {
	
	//Consider here there are different brands creating vehicles.
	//And each brand have different type of object creation with 20 lines of code and consider there are 20 brands i.e., 400 lines which is not good.
	//The above problem is solved using abstract factory pattern.
	//Example like: Factory Pattern focuses on one brand and abstract factory focuses on multiple brands.
	
	//Instead of a vehicle factory class, here we create separate factory for each brand like brand1Factory, brand2Factory etc.
	//It is like factory of factories.
	
	//Every time you invoke createVehicle, it will return new object i.e., car.
	
	//If want new brand, add new class.
	//If changes needed for brand, then change in particular class.
	//Abstract Factory: Handles the creation of related objects without specifying in concrete class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory kiafactory=new KiaFactory();
		Vehicle kia1=kiafactory.createVehicle();
		kia1.start();
		kia1.stop();
		
		VehicleFactory hondafactory=new HondaFactory();
		Vehicle honda=hondafactory.createVehicle();
		honda.start();
		honda.stop();
		
		VehicleFactory benzfactory=new BenzFactory();
		Vehicle benz=benzfactory.createVehicle();
		benz.start();
		benz.stop();
		
		Vehicle kia2=kiafactory.createVehicle();
		kia2.start();
		kia2.stop();
	}

}
