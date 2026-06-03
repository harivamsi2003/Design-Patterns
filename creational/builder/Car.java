package builder;

public class Car {
	private String engine;
	private int wheels;
	private String color;
	private int capacity;
	private int seats;
	private String model;
	private boolean sunroof;
	private boolean hasNavigationSystem;
	
	private Car(CarBuilder builder) {
		this.engine = builder.engine;
		this.wheels = builder.wheels;
		this.color = builder.color;
		this.capacity = builder.capacity;
		this.seats = builder.seats;
		this.model = builder.model;
		this.sunroof = builder.sunroof;
		this.hasNavigationSystem = builder.hasNavigationSystem;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public String getColor() {
		return color;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getSeats() {
		return seats;
	}

	public String getModel() {
		return model;
	}

	public boolean isSunroof() {
		return sunroof;
	}

	public boolean isHasNavigationSystem() {
		return hasNavigationSystem;
	}
	
	@Override
	public String toString() {
		return "Car {Engine: "+engine+", wheels: "+wheels+", color: "+color+", capacity(in cc): "+capacity+", seats: "+seats+", model: "+model+", sunroof: "+sunroof
				+", hasNavigationSystem: "+hasNavigationSystem+"}";
	}
	
	public static class CarBuilder {
		private String engine;
		private int wheels = 4;
		private String color = "Blue";
		private int capacity = 125;
		private int seats = 4;
		private String model = "Sedan";
		private boolean sunroof = false;
		private boolean hasNavigationSystem = false;
		
		public CarBuilder setEngine(String engine) {
			this.engine = engine;
			return this;
		}
		public CarBuilder setWheels(int wheels) {
			this.wheels = wheels;
			return this;
		}
		public CarBuilder setColor(String color) {
			this.color = color;
			return this;
		}
		public CarBuilder setCapacity(int capacity) {
			this.capacity = capacity;
			return this;
		}
		public CarBuilder setSeats(int seats) {
			this.seats = seats;
			return this;
		}
		public CarBuilder setModel(String model) {
			this.model = model;
			return this;
		}
		public CarBuilder setSunroof(boolean sunroof) {
			this.sunroof = sunroof;
			return this;
		}
		public CarBuilder setHasNavigationSystem(boolean hasNavigationSystem) {
			this.hasNavigationSystem = hasNavigationSystem;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
}
