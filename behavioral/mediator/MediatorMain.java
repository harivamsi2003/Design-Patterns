package mediator;

public class MediatorMain {
	
	//It promotes smoother communication.
	//Instead of maintaining communication between each of object directly, we introduce mediator, where all objects communicate with mediator and it will pass to other objects.
	//Example: Chat Room, Auction etc.
	//It is like a WhatsApp group. WhatsApp group acts like mediator between users, instead each of them communicate with each other individually.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatMediator mediator=new ChatRoom();
		
		User user1=new User("User 1", mediator);
		User user2=new User("User 2", mediator);
		User user3=new User("User 3", mediator);
		
		user1.sendMessage("Hi from user1");
		user2.sendMessage("Hi from user2");
		user3.sendMessage("Hi from user3");
	}

}
