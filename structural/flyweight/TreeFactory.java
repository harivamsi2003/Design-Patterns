package flyweight;

import java.util.*;

public class TreeFactory {
	private static Map<String, TreeType> cache=new HashMap<>();
	
	public TreeType getTreeType(String name, String color, String size) {
		String str=name+","+color+","+size;
		
		return cache.computeIfAbsent(str, k -> new TreeType(name, color, size));
	}
}
