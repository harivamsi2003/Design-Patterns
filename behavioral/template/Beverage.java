package template;

public abstract class Beverage {
	public final void prepare() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
		System.out.println(getClass().getSimpleName()+" is ready.");
	}
	
	private void boilWater() {
		System.out.println("Boiling Water");
	}
	
	private void pourInCup() {
		System.out.println("Pouring into the cup");
	}
	
	//Changes according to child classes.
	protected abstract void brew();
	protected abstract void addCondiments();
}
