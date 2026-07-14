package chainOfResponsibility;

public class Supervisor extends SupportHandler {

	@Override
	protected boolean canHandle(int severity) {
		// TODO Auto-generated method stub
		return severity<=2;
	}

	@Override
	protected void resolve(String issue) {
		// TODO Auto-generated method stub
		System.out.println("Supervisor resolved the issue: "+issue);
	}

}
