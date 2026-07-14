package chainOfResponsibility;

public abstract class SupportHandler {
	protected SupportHandler nextHandler;
	
	public void setNextHandler(SupportHandler handler) {
		this.nextHandler=handler;
	}
	
	public void handleRequest(String issue, int severity) {
		if(canHandle(severity)) {
			resolve(issue);
		}
		else if(nextHandler!=null) {
			System.out.println("Passing to Next Level.");
			nextHandler.handleRequest(issue, severity);
		}
		else {
			System.out.println("No one can handle this issue: "+issue);
		}
	}
	
	protected abstract boolean canHandle(int severity);
	protected abstract void resolve(String issue);
}
