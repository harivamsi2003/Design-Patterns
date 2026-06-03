package prototype;

public class Prototype {
	
	//This design pattern allows you to create new object by cloning an existing prototype and modifying only what's needed.
	//This pattern is especially useful when working with similar objects, saving time and effort.
	//Consider case of video game character, instead of creating a new character every time, new character is getting cloned using already created character making only necessary changes.
	
	//Shallow copy -> Object reference is copied (If copy is changed, then original will be changed too).
	//In shallow copy, primitive and strings remain same in original when you change in copied instances.
	//Deep copy -> A new object is created with all fields.
	//If there are any reference type fields in a class, it is better to use deep copy as in shallow copy, as reference type fields are mutable because reference address is copied to cloned object.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1=new Car("Honda", "City", 4, 2024);
		
		System.out.println("Car1: "+car1.toString());
		
		Car car2=car1.clone();
		System.out.println("Car2 (Before change): "+car2.toString());
		car2.setBrand("Xiaomi");
		car2.setModel("YU 7");
		car2.setSeats(6);
		car2.setYear(2026);
		System.out.println("Car2 (After change): "+car2.toString());
		
		System.out.println("Car1 (After Car2 change): "+car1.toString());
	}

}
