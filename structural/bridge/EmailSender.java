package bridge;

public class EmailSender implements MessageSender {

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sending E-mail: "+message);
	}

}
