package command;

public class LightOnComand implements Commands {
	private Light light;
	
	public LightOnComand(Light light) {
		this.light=light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.turnOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.light.turnOff();
	}

}
