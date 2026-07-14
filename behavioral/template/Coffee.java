package template;

public class Coffee extends Beverage {

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("Brewing coffee beans.");
	}

	@Override
	protected void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding sugar and milk.");
	}

}
