package General;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SongsPlaylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] songs = {"song1", "song2","song3","song4","song5","song6","song7","song8","song9","song10"  };
		
		playSongs(songs);
		
	}

	private static void playSongs(String[] songs) {
		// TODO Auto-generated method stub
		
		int size = songs.length;
		 ArrayList<Integer> list = new ArrayList<Integer>(size);
	     for(int i = 0; i < size; i++) {
	            list.add(i);
	        }

	     int randomNumber = 0;
		 Random rand = new Random();
		 while(list.size() > 0) 
		 {
		  	 randomNumber = rand.nextInt(list.size());
		    // System.out.print(list.remove(randomNumber) +" ");
		     System.out.println("Now Playing " + list.remove(randomNumber));
		 }
		     
			
		
		
		
	}

}
