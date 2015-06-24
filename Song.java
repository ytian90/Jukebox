package ch8_Q3_Jukebox;

/**
 * An implementation of Song Object
 * @author yutian
 * @since Jun 23, 2015
 */
public class Song {
	
	/**
	 * Name of the song
	 */
	private String songName; 
	
	/**
	 * Song Constructor
	 * @param name
	 */
	public Song(String name)
	{
		this.songName = name; 
	}
	
	/**
	 * toString() function to return the song's name
	 */
	public String toString()
	{
		return songName; 
	}

}
