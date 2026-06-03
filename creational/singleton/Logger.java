package singleton;

public class Logger {
	
	//Use of volatile here: when one thread update here, it is visible to all other threads globally.
	private static volatile Logger logger = null;
	
	//Constructor is private so that no one is allowed to create object;
	private Logger() {
		
	}
	
	
	//If there is no synchronized, then two or more threads might create two objects which leads to race condition.
	public static Logger logger() {
		if(logger == null) {
			synchronized (Logger.class) { //Synchronized only when creating the instance
				if(logger == null) { //Second check
					logger = new Logger(); //Create new instance even if it's still null.
				}
			}
		}
		
		return logger;
	}
	
	public void logs(String message) {
		System.out.println("Log: "+message);
	}
}
