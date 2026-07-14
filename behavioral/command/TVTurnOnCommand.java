package command;

public class TVTurnOnCommand implements Commands {
	private TV tv;
	
	public TVTurnOnCommand(TV tv) {
		this.tv=tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.tv.turnOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.tv.turnOff();
	}

}
