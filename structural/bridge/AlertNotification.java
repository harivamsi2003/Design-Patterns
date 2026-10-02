package bridge;

public class AlertNotification extends Notification {
	
	public AlertNotification(MessageSender ms) {
		super(ms);
	}
	
	@Override
	void notify(String message) {
		// TODO Auto-generated method stub
		ms.send("ALERT: "+message);
	}

}
