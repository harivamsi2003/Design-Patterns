package decorator;

public class SugarDecorator extends CoffeeDecorator {
	
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription()+" , Sugar";
	}
	
	@Override
	public long getCost() {
		return coffee.getCost()+5;
	}
}
