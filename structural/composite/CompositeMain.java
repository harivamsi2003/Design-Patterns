package composite;

public class CompositeMain {
	
	//Consider you are building a smart home. A home has multiple floors, a floor has multiple rooms, a room has multiple smart appliances.
	//It is like hierarchy and you need to go to each room and turn or turn off the appliances in the room.
	//Composite design pattern solves this. Instead you can do like turn off all devices with a single click.
	//It is like tree structure, composite (a container object) that can hold leaves (appliances) as well as the other composite objects(like rooms, floors (OR) parent nodes of tree).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartComponent ac=new AirConditioner();
		SmartComponent light=new SmartLight();
		
		CompositeSmartComponent room1=new CompositeSmartComponent();
		room1.addSmartComponent(ac);
		room1.addSmartComponent(light);
		
		CompositeSmartComponent room2=new CompositeSmartComponent();
		room2.addSmartComponent(ac);
		room2.addSmartComponent(light);
		
		CompositeSmartComponent floor=new CompositeSmartComponent();
		floor.addSmartComponent(room1);
		floor.addSmartComponent(room2);
		
		CompositeSmartComponent home=new CompositeSmartComponent();
		home.addSmartComponent(floor);
		
		System.out.println("Turning On All Home");
		home.turnOn();
		System.out.println();
		
		System.out.println("Turning On floor");
		floor.turnOn();
		System.out.println();
		
		System.out.println("Turning On Room1");
		room1.turnOn();
		System.out.println();
	}

}
