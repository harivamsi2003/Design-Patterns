package proxy;

//Common interface for real object and proxy object.
public interface PaymentService {
	String pay(String userId, long amount);
}
