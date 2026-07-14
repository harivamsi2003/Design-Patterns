package command;

public class TVTurnOffCommand implements Commands {
	private TV tv;
	
	public TVTurnOffCommand(TV tv) {
		this.tv=tv;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.tv.turnOff();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.tv.turnOn();
	}

}
