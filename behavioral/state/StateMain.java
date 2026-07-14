package state;

public class StateMain {
	
	//It manages the object state.
	//Example: traffic light -> each color represent a state.
	//Each state is a different behavior.
	//It allows an object to change its behavior when its internal state changes.
	//It makes the object appear to change its class by encapsulating state-specific behavior in separate classes.
	//Example: Vending Machine -> States: insertCoin, ejectCoin, dispense, refill.
	//Example: Traffic Lights, Light (On, Off states).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light=new Light();
		
		light.pressSwitch();
		light.pressSwitch();
		light.pressSwitch();
		light.pressSwitch();
	}

}
