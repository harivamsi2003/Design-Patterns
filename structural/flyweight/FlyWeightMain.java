package flyweight;

public class FlyWeightMain {
	
	//The Flyweight Design Pattern is a structural design pattern used when we have a large number of similar objects and creating a separate object for every occurrence would waste memory.
	//Reuse the same object whenever possible instead of creating new objects repeatedly.
	//Is is for managing memory usage.
	
	//Consider a game have multiple trees. Each tree have {tree type, color, size} but different co-ordinates.
	//Instead of creating for each tree every new object, we share the common object for multiple positions.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeFactory tf=new TreeFactory();
		
		TreeType apple1=tf.getTreeType("Apple", "Green", "Large");
		TreeType apple2=tf.getTreeType("Apple", "Red", "Large");
		TreeType apple3=tf.getTreeType("Apple", "Green", "Large");
		
		apple1.draw(3, 4);
		apple2.draw(10, 10);
		apple3.draw(7, 7);
		
		System.out.println();
		System.out.println(apple1==apple2);
		System.out.println(apple1==apple3);
	}

}
