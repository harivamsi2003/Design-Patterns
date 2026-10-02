package decorator;

public class DecoratorMain {
	
	//The Decorator Design Pattern is used when you want to add new behavior/features to an existing object without modifying its original class.
	//We define a common interface for base class and its decorators.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee coffee=new NormalCoffee();
		
		System.out.println("Description: "+coffee.getDescription()+"\nCost: "+coffee.getCost()+"\n-----------------------\n");
		
		//Add milk
		coffee=new MilkDecorator(coffee);
		System.out.println("Description: "+coffee.getDescription()+"\nCost: "+coffee.getCost()+"\n-----------------------\n");
		
		//Add sugar
		coffee=new SugarDecorator(coffee);
		System.out.println("Description: "+coffee.getDescription()+"\nCost: "+coffee.getCost()+"\n-----------------------\n");
	}

}
