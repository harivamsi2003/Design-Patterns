package chainOfResponsibility;

public class FrontDesk extends SupportHandler {
	
	@Override
	protected boolean canHandle(int severity) {
		// TODO Auto-generated method stub
		return severity<=1;
	}

	@Override
	protected void resolve(String issue) {
		// TODO Auto-generated method stub
		System.out.println("Front Desk resolved the issue: "+issue);
	}

}
