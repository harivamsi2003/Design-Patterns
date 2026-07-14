package iterator;

public class IteratorMain {
	
	//Example: Music play list.
	//Useful when we want to access elements in the collection.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayList myfav = new PlayList("My Favourites");
		System.out.println(myfav.getName());
		
		myfav.addSong("Song 1");
		myfav.addSong("Song 2");
		myfav.addSong("Song 3");
		
		ListIterator<String> iterator = myfav.createIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
