package momento;

public class MomentoMain {
	
	//The Memento pattern lets you save and restore an object's state without exposing its internal structure. It's like having a "save game" feature for any object!
	//Example: Text Editor. You can save, undo.
	//Example: Game. You can save game, load game, continue playing.
	//Here we create separate objects(momentos) when we create a state(i.e., save).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor editor=new TextEditor();
		EditorHistory history=new EditorHistory();
		
		editor.setText("Hello");
		System.out.println("Current text: "+editor.getText());
		history.pushToHistory(editor.save());
		
		editor.setText("Hello, World!");
		System.out.println("Current text: "+editor.getText());
		history.pushToHistory(editor.save());
		
		editor.setText("Hello, World! Java is interesting.");
		System.out.println("Current text: "+editor.getText());
		history.pushToHistory(editor.save());
		
		Momento previous=history.popFromHistory();
		editor.restore(previous);
		System.out.println(editor.getText());
		
		previous=history.popFromHistory();
		editor.restore(previous);
		System.out.println(editor.getText());
	}

}
