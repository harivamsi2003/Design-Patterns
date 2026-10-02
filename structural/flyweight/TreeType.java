package flyweight;

public class TreeType {
	private String name;
	private String color;
	private String size;
	
	public TreeType(String name, String color, String size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	public void draw(int x, int y) {
		System.out.println("Drawing tree: '"+this.name+"' of color: '"+this.color+"' of size: '"+this.size+"' at co-ordinates: {"+x+", "+y+"}.");
	}
}
