package observer;

import java.util.*;

public class YouTubeChannel implements Subject {
	private String name;
	private List<Subscriber> subscribers = new ArrayList<>();
	
	public YouTubeChannel(String name) {
		this.name=name;
	}
	
	@Override
	public void addSubscriber(Subscriber sb) {
		subscribers.add(sb);
		System.out.println("A new subscriber "+sb.getMailId()+" has joined to channel "+this.name);
	}
	
	@Override
	public void removeSubscriber(Subscriber sb) {
		subscribers.remove(sb);
		System.out.println(sb.getMailId()+" has unsubscribed to channel "+this.name);
	}
	
	@Override
	public void uploadVideo(String message) {
		System.out.println(this.name+" has uploaded video: "+message);
		System.out.println("Notifying all subscribers.");
		
		for(Subscriber sb:subscribers) {
			sb.notification(message);
		}
	}
}
