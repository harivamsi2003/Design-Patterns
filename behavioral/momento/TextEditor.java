package momento;

public class TextEditor {
	private String text;
	
	public void setText(String text) {
		this.text=text;
	}
	
	public String getText() {
		return this.text;
	}
	
	public Momento save() {
		return new Momento(this.text);
	}
	
	public void restore(Momento momento) {
		this.text=momento.getText();
	}
}
