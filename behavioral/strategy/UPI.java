package strategy;

public class UPI implements PaymentMethod {
	private String app;
	
	public UPI(String app) {
		this.app=app;
	}
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Amount $"+amount+" paid through "+this.app+" app successfully.");
	}
}
