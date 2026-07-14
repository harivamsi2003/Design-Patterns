package template;

public class Tea extends Beverage {

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping Tea bag.");
	}

	@Override
	protected void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding ginger and lemon.");
	}

}
