package mediator;

public class User {
	private String name;
	private ChatMediator mediator;
	
	public User(String name, ChatMediator mediator) {
		this.name=name;
		this.mediator=mediator;
		mediator.addUser(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void sendMessage(String message) {
		System.out.println("\n"+this.name+" has sent message "+message);
		mediator.sendMessage(message, this);
	}
	
	public void receiveMessage(String message, String sender) {
		System.out.println("\n"+this.name+" has received message: "+message+" :from user -> "+sender);
	}
}
