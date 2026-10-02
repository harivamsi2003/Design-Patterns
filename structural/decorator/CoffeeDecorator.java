package decorator;

public abstract class CoffeeDecorator implements Coffee {
	
	protected Coffee coffee;
	
	public CoffeeDecorator(Coffee coffee) {
		this.coffee=coffee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription();
	}

	@Override
	public long getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost();
	}

}
