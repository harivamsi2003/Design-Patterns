package command;

public class CommandMain {
	
	//Example: Remote control -> You press button (give commands) and it will execute.
	//The Command pattern encapsulates a request as an object.
	//It turns a request or action into a stand-alone object containing all information about the request.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light roomLight=new Light("Room Light");
		Light kitchenLight=new Light("Kitchen Light");
		TV hallTV=new TV("Hall TV");
		
		Commands roomLightOn=new LightOnComand(roomLight);
		Commands roomLightOff=new LightOffCommand(roomLight);
		Commands kitchenLightOn=new LightOnComand(kitchenLight);
		Commands kitchenLightOff=new LightOffCommand(kitchenLight);
		Commands hallTVOn=new TVTurnOnCommand(hallTV);
		Commands hallTVOff=new TVTurnOffCommand(hallTV);
		
		RemoteControl remote=new RemoteControl();
		
		remote.setCommand(0, roomLightOn, roomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, hallTVOn, hallTVOff);
		
		remote.pressOffButton(0);
		remote.pressOnButton(0);
		
		remote.pressOnButton(1);
		remote.pressUndoButton();
		remote.pressUndoButton();
	}

}
