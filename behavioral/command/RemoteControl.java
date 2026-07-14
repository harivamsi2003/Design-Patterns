package command;

public class RemoteControl {
	private Commands[] onCommands;
	private Commands[] offCommands;
	private Commands lastCommand;
	
	public RemoteControl() {
        onCommands = new Commands[3];
        offCommands = new Commands[3];
        
        for (int i = 0; i < 3; i++) {
            onCommands[i] = null;
            offCommands[i] = null;
        }
        lastCommand=null;
    }
	
	public void setCommand(int slot, Commands onCommand, Commands offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void pressOnButton(int slot) {
        System.out.println("\nPressing ON button " + slot);
        onCommands[slot].execute();
        lastCommand=onCommands[slot];
    }
    
    public void pressOffButton(int slot) {
        System.out.println("\nPressing OFF button " + slot);
        offCommands[slot].execute();
        lastCommand=offCommands[slot];
    }
    
    public void pressUndoButton() {
    	if(lastCommand==null) {
    		System.out.println("\nEverything is in initial state");
    	}
    	else {
    		System.out.println("\nPressing UNDO button");
    		lastCommand.undo();
    	}
    }
}
