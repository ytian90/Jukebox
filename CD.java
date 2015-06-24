package ch8_Q3_Jukebox;

import java.util.LinkedList;
import java.util.Queue;

/**
 * An implementation of CD object
 * @author yutian
 * @since Jun 23, 2015
 */
public class CD {
	
	/**
	 * Queue List to hold the list of songs in CD
	 */
	private Queue<Song> songlist; 
	
	/**
	 * CD Constructor 
	 */
	public CD()
	{
		// IMPORTANT: Use LinkedList to implement the Queue. 
		songlist = new LinkedList<Song>(); 
	}
	
	/**
	 * Return the song list
	 * @return songlist
	 */
	public Queue<Song> getSonglist()
	{
		return this.songlist; 
	}
	
	/**
	 * Initialize the CD with 12 songs
	 * @param str	string list with 12 songs
	 */
	public void makeCD(String[] str)
	{
		// assume the number of songs in a standard CD is 12 songs. 
		if (str.length == 12)
		{
			for (int i = 0; i < str.length; i++)
			{
				Song newSong = new Song(str[i]); 
				
				songlist.add(newSong); 
			}
		}
		else 
		{
			System.err.println("The number of songs are wrong.");
		}
	}
	
	/**
	 * Override the toString() method. 
	 */
	@Override
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		
		str.append("This album has 12 songs.\n");
		
		for (Song s : this.songlist)
		{
			str.append(s); 
			str.append("\n"); 
		}
			
		return str.toString();
	}

}
