package ch8_Q3_Jukebox;

public class SongSelector {

	private Song currentSong; 
	
	public SongSelector(Song s)
	{
		currentSong = s; 
	}
	
	public void setSong(Song s)
	{
		currentSong = s; 
	}
	
	public Song getCurrentSong() {
		// TODO Auto-generated method stub
		return currentSong;
	}

	
	
}
