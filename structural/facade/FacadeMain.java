package facade;

public class FacadeMain {
	
	//It reduces the complexity with a unified interfaces.
	//It hides the internal complexity of the system, making it easier to use and maintain.
	//We have used this pattern in other patterns like wrapping up complexity in a class or interface hiding the internal implementation.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderFacade of=new OrderFacade();
		
		of.placeOrder("Dosa", 70);
		
		of.placeOrder("Ice cream", 100);
	}

}
