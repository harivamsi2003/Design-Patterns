package proxy;

public class ProxyMain {
	
	//The Proxy Design Pattern is a structural design pattern where we create an object called a Proxy that stands in front of the real object.
	//Client -> Proxy -> Real Object.
	//Here client doesn't know whether it is talking to proxy or real object.
	//It is mainly like controlling access.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService ps=new PaymentProxy();
		
		System.out.println(ps.pay("David", 100));
		
		System.out.println(ps.pay("Rahul", 200));
	}

}
