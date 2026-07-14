package iterator;

import java.util.*;

public class PlayListIterator implements ListIterator<String> {
	private List<String> songs;
	private int position=0;
	
	public PlayListIterator(List<String> songs) {
		this.songs=songs;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return position<songs.size();
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		if(!hasNext()) {
			return null;
		}
		return songs.get(position++);
	}
}
