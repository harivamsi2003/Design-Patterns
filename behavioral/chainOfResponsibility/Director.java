package chainOfResponsibility;

public class Director extends SupportHandler {

	@Override
	protected boolean canHandle(int severity) {
		// TODO Auto-generated method stub
		return severity<=4;
	}

	@Override
	protected void resolve(String issue) {
		// TODO Auto-generated method stub
		System.out.println("Director resolved the issue: "+issue);
	}

}
