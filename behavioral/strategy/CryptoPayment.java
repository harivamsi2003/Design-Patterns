package strategy;

public class CryptoPayment implements PaymentMethod {
	private String walletAddress;
	
	public CryptoPayment(String walletAddress) {
		this.walletAddress=walletAddress;
	}
	
	@Override
	public void processPayment(double amount) {
		System.out.println("Amount $"+amount+" paid using crypto wallet "+this.walletAddress+" is successful.");
	}
}
