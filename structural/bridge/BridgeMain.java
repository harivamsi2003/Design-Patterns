package bridge;

public class BridgeMain {
	
	//Bridge design pattern separates abstraction from implementation, so both can evolve independently.
	//If any new implementation comes, we can add it without modifying the existing abstraction classes.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notification emailNotification=new AlertNotification(new EmailSender());
		emailNotification.notify("Spam Email Alert\n");
		
		Notification smsNotification=new AlertNotification(new SMSsender());
		smsNotification.notify("Spam SMS Alert\n");
	}

}
