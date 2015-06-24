package ch8_Q3_Jukebox;

import java.util.LinkedList;
import java.util.Queue; 

/**
 * An implementation of the Playlist Object
 * @author yutian
 * @since Jun 23, 2015
 */
public class Playlist {

	/**
	 * Queue represents the playlist
	 */
	private Queue<Song> playlist; 
	
	/**
	 * Number of songs in the playlist
	 */
	private int numberSongs = 0; 
	
	/**
	 * Playlist Constructor
	 * @param cd CD
	 */
	public Playlist(CD cd)
	{
		super(); 
		this.playlist = new LinkedList<Song>(); 
		this.addCD(cd);
	}
	
	/**
	 * Return the first song in the playlist
	 * @return first song
	 */
	public Song getNextSongToPlay()
	{
		return playlist.peek(); 
	}
	
	/**
	 * Add a new song to the playlist
	 * @param s the Song to add
	 */
	public void addSong(Song s)
	{
		this.playlist.add(s); 
		this.numberSongs++; 
	}
	
	/**
	 * Add a new CD to the playlist
	 * @param c the CD to add
	 */
	public void addCD(CD c)
	{
		for (Song s : c.getSonglist())
		{
			this.addSong(s); 
		}
	}
	
//	public void removeSong(Song s)
//	{
//		if (this.numberSongs > 0)
//		{
//			this.playlist.remove(s); 
//			this.numberSongs--; 
//		}
//		else 
//		{
//			System.err.println("Empty playlist");
//		}
//	}
	
	/**
	 * Remove the first song in the playlist
	 */
	public void removeSong()
	{
		if (this.numberSongs > 0)
		{
			this.playlist.remove(); 
			this.numberSongs--; 
		}	
		else 
			System.err.println("Empty playlist");
	}
	
	/**
	 * Return the number of songs in the playlist
	 * @return Number of songs 
	 */
	public int getSongNum()
	{
		return this.numberSongs; 
	}
	
	/**
	 * Return the playlist
	 * @return playlist
	 */
	public Queue<Song> getPlaylist()
	{
		return this.playlist; 
	}
	
	/**
	 * Output the playlist
	 */
	@Override
	public String toString()
	{
		StringBuilder str = new StringBuilder();
		
		str.append(this.numberSongs); 
		str.append(" songs left\n");
		
		for (Song s : this.playlist)
		{
			str.append(s); 
			str.append("\n"); 
		}
			
		return str.toString();
	}
	
}
