package strategy;

public class Main {
	
	//Strategy Pattern: It is used when there are many ways to solve a problem.
	//Example: Payment -> Credit card, UPI, etc.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart amazonCart = new ShoppingCart();
		
		amazonCart.addItem(new Item("Laptop", 399.99));
		amazonCart.addItem(new Item("Mobile", 299.99));
		
		amazonCart.setPaymentMethod(new CreditCardPayment("123456781234", 000));
		amazonCart.payBill();
		
		amazonCart.addItem(new Item("Fan", 59.99));
		
		amazonCart.setPaymentMethod(new UPI("Paytm"));
		amazonCart.payBill();
	}

}
