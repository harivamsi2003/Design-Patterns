package state;

public class Light {
	private State currentState;
	
	public Light() {
		currentState=new OffState();
	}
	
	public void setState(State state) {
        currentState = state;
    }
    
    public void pressSwitch() {
        currentState.pressSwitch(this);
    }
}
