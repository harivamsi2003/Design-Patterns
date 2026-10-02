package proxy;

public class RealPaymentService implements PaymentService {
	
	@Override
	public String pay(String userId, long amount) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Payment GateWay.\n");
		
		System.out.println("Payment gateway processed payment.\n");
		
		return "Payment successful for user: "+userId+" of amount: "+amount+"/-\n"; 
	}

}
