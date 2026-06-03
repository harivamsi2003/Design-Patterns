package prototype;

public class Car implements Vehicle {
	private String brand;
	private String model;
	private int seats;
	private int year;
	
	public Car(String brand, String model, int seats, int year) {
		this.brand = brand;
		this.model = model;
		this.seats = seats;
		this.year = year;
	}
	
	private Car(Car other) {
		this.brand=other.brand;
		this.model=other.model;
		this.seats=other.seats;
		this.year=other.year;
	}
	
	@Override
	public Car clone() {
		return new Car(this); //Calls Copy Constructor
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Brand: "+this.brand+"\nModel: "+this.model+"\nSeats: "+this.seats+"\nYear: "+this.year+"\n============================================\n";
	}
}
