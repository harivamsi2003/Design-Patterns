package singleton;

public class Singleton {
	
	//It is useful when you need to create only one instance of a class.
	//It is thread safe.
	
	//Use case of singleton: Database connection -> prevents multiple database connection.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application a1 = new Application();
		a1.run();
		System.out.println("A1 hascode: "+a1.hashCode());
		
		Application a2 = new Application();
		a2.run();
		System.out.println("A2 hascode: "+a2.hashCode());
		
		//Verification for singleton
		Logger log1 = Logger.logger();
		Logger log2 = Logger.logger();
		System.out.println("Same logger instance: "+(log1 == log2));
	}

}
