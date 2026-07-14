package observer;

public class Subscriber implements Observer {
	private String mailId;
	
	public Subscriber(String mailId) {
		this.mailId=mailId;
	}
	
	public String getMailId() {
		return mailId;
	}

	@Override
	public void notification(String message) {
		System.out.println(this.mailId+" you got notification: "+message);
	}
}
