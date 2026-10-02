package bridge;

public class SMSsender implements MessageSender {

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS: "+message);
	}

}
