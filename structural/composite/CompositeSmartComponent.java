package composite;

import java.util.*;

public class CompositeSmartComponent implements SmartComponent {
	private List<SmartComponent> sclist = new ArrayList<>();
	
	public void addSmartComponent(SmartComponent sc) {
		sclist.add(sc);
	}
	
	public void deleteSmartComponent(SmartComponent sc) {
		sclist.remove(sc);
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		for(SmartComponent sc:sclist) {
			sc.turnOn();
		}
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		for(SmartComponent sc:sclist) {
			sc.turnOff();
		}
	}

}
