package builder;

public class Builder {
	
	//It is useful when an object has many attributes or optional fields.
	//If there are more attributes, then more constructors are needed even if some fields are optional. To overcome this we use Builder Design pattern.
	//Here we can create object step-by-step.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car.CarBuilder()
				.setEngine("V8")
				.setCapacity(100)
				.setColor("White")
				.setHasNavigationSystem(true)
				.setSeats(6)
				.build(); //build -> Return the final car object.
		
		System.out.println(car1);
		
		Car car2 = new Car.CarBuilder()
				.setEngine("V6")
				.setCapacity(150)
				.setColor("Grey")
				.setSunroof(true)
				.build();
		
		System.out.println(car2);
		
		//Instead of creating new Car.CarBuilder for every object, we can create an reset method inside Car class.
	}

}
