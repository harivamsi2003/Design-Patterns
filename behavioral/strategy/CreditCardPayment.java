package strategy;

@SuppressWarnings("unused")
public class CreditCardPayment implements PaymentMethod {
	private String cardNumber;
	private int cvv;
	
	public CreditCardPayment(String cardNumber, int cvv) {
		this.cardNumber=cardNumber;
		this.cvv=cvv;
	}
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Amount $"+amount+" paid through Credit Card successfully.");
	}
}
