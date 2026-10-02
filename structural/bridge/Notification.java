package bridge;

public abstract class Notification {
	protected MessageSender ms;
	
	public Notification(MessageSender ms) {
		this.ms=ms;
	}
	
	abstract void notify(String message);
}
