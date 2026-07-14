package momento;

import java.util.*;

public class EditorHistory {
	//Storing the momentos.
	private Stack<Momento> history=new Stack<>();
	
	public void pushToHistory(Momento momento) {
		this.history.push(momento);
	}
	
	public Momento popFromHistory() {
		if(history.isEmpty()) {
			return null;
		}
		return history.pop();
	}
}
