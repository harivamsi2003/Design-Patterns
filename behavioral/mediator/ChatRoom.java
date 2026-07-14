package mediator;

import java.util.*;

public class ChatRoom implements ChatMediator {
	private List<User> users = new ArrayList<>();
	@Override
	public void sendMessage(String message, User sender) {
		// TODO Auto-generated method stub
		for(User us:users) {
			if(us!=sender) {
				us.receiveMessage(message, sender.getName());
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		System.out.println("\n"+user.getName()+" added to chat");
	}

}
