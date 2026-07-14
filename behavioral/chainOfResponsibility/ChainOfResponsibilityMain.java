package chainOfResponsibility;

public class ChainOfResponsibilityMain {
	
	//The Chain of Responsibility pattern allows multiple objects to handle a request by passing it along a chain until one object handles it.
	//Each handler decides whether to process the request or pass it to the next handler.
	//Example: Customer Support. There are multiple levels in it. If issue is not resolved in a level, it is forwarded to higher level until the top most level.
	//Example: Leave Request Approval.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontDesk frontdesk=new FrontDesk();
		Supervisor supervisor=new Supervisor();
		Manager manager=new Manager();
		Director director=new Director();
		
		//Building chain
		frontdesk.setNextHandler(supervisor);
		supervisor.setNextHandler(manager);
		manager.setNextHandler(director);
		
		 System.out.println("\n-- Issue 1: severity 1 --");
        frontdesk.handleRequest("Password reset", 1);
        
        System.out.println("\n-- Issue 2: severity 2 --");
        frontdesk.handleRequest("Software installation", 2);
        
        System.out.println("\n-- Issue 3: severity 3 --");
        frontdesk.handleRequest("System crash", 3);
        
        System.out.println("\n-- Issue 4: severity 4 --");
        frontdesk.handleRequest("Security breach", 4);
	}

}
