package command;

public interface Commands {
	void execute(); //Execute -> Executes what the user gives turnOn, turnOff.
	void undo(); //Restores the previous state. Example: initially light is on. Now user turnsOff the light. If undo it, light will again turnOn.
}
