package singleton;

public class Application {
	
	private Logger log;
	
	public Application() {
		this.log=Logger.logger();
	}
	
	public void run() {
		log.logs("Application started");
	}
}
