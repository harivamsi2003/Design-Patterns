package decorator;

public class NormalCoffee implements Coffee {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Normal Coffee";
	}

	@Override
	public long getCost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
