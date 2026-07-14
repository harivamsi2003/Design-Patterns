package observer;

public interface Subject {
	//Subject => YouTuber
	void addSubscriber(Subscriber sb);
	void removeSubscriber(Subscriber sb);
	void uploadVideo(String title);
}
