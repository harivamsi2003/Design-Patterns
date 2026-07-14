package iterator;

import java.util.*;

public class PlayList implements PlayListCollection {
	
	private List<String> songs=new ArrayList<>();
	private String playListName;
	
	public PlayList(String name) {
		this.playListName=name;
	}
	
	public void addSong(String song) {
		this.songs.add(song);
	}
	
	public void removeSong(String song) {
		if(this.songs.contains(song)) {
			this.songs.remove(song);
		}
		else {
			System.out.println("Song not there");
		}
	}
	
	public String getName() {
		return this.playListName;
	}
	
	@Override
	public ListIterator<String> createIterator() {
		// TODO Auto-generated method stub
		return new PlayListIterator(songs);
	}

}
