package template;

public class TemplateMain {
	
	//It defines the skeleton of an algorithm in a base class. It allows sub classes to override them without changing algorithm structure.
	//Example: Coffee, tea i.e., making beverages etc. Here common for these things making is pourInCup, brew, addCondiments(sugar etc.).
	//Common things are wrapped up into a single class and sub class make changes according to them.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============Making Tea:==============");
		Beverage tea=new Tea();
		tea.prepare();
		
		System.out.println("==============Making Coffee:==============");
		Beverage coffee=new Coffee();
		coffee.prepare();
	}

}
