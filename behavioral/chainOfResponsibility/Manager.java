package chainOfResponsibility;

public class Manager extends SupportHandler {

	@Override
	protected boolean canHandle(int severity) {
		// TODO Auto-generated method stub
		return severity<=3;
	}

	@Override
	protected void resolve(String issue) {
		// TODO Auto-generated method stub
		System.out.println("Manager resolved the issue: "+issue);
	}

}
