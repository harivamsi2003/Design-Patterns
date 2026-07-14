package observer;

public class ObserverMain {
	
	//Example: Notification System.
	//It allows one object to notify to other objects whenever there is change in state.
	//It defines a one-to-many dependency where when one object (subject) changes state, all its dependents (observers) are automatically notified and updated.
	//If a you tuber uploads a video, then all persons who have subscribed to that channel will get notification.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YouTubeChannel techSmart = new YouTubeChannel("Tech Smart");
		
		Subscriber sb1 = new Subscriber("sb1@test.com");
		Subscriber sb2 = new Subscriber("sb2@test.com");
		
		techSmart.addSubscriber(sb1);
		techSmart.addSubscriber(sb2);
		
		techSmart.uploadVideo("Different types of logic gates.");
		
		techSmart.removeSubscriber(sb2);
		
		techSmart.uploadVideo("Observer Design Pattern.");
	}

}
