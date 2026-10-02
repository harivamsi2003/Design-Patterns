package adapter;

public class AdapterMain {
	
	//Adapter Pattern lets two incompatible interfaces work together by wrapping one object inside a translator class.
	//Example Suppose we have devices with USB, HDMI, and Type-C ports, but a new laptop supports only Type-C. -
	//-Instead of changing the existing devices or cables, we use an Adapter to connect USB/HDMI devices to the Type-C port.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartDevice ac=new AirConditionerAdapter(new AirConditioner());
		SmartDevice sl=new SmartLightAdapter(new SmartLight());
		
		ac.turnOn();
		sl.turnOn();
		
		ac.turnOff();
		sl.turnOff();
	}

}
