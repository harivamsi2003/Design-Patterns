package proxy;

import java.util.*;

public class PaymentProxy implements PaymentService {
	
	private RealPaymentService rps;
	private Map<String, String> cache=new HashMap<>();
	
	private boolean isAuthenticate(String id) {
		return id!=null && !id.isBlank();
	}
	
	@Override
	public String pay(String userId, long amount) {
		// TODO Auto-generated method stub
		System.out.println("Proxy: request received\n");
		
		String key=userId+":"+amount;
		
		if(!isAuthenticate(userId)) {
			return "Payment failed---> Reason: User not Authenticated.\n";
		}
		
		if(cache.containsKey(key)) {
			System.out.println("Proxy: returning cached result.\n");
			
			return cache.get(key);
		}
		
		if(rps==null) {
			System.out.println("Creating Real Payment Service\n");
			rps=new RealPaymentService();
		}
		
		System.out.println("Proxy: Processing payment for user: "+userId+" of amount: "+amount+"/-\n");
		
		String res=rps.pay(userId, amount);
		
		cache.put(key, res);
		
		System.out.println("Procy: result cached");
		
		return res;
	}

}
