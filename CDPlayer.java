package ch8_Q3_Jukebox;

import java.util.Scanner;

/**
 * An implementation of CDPlayer
 * @author yutian
 * @since Jun 23, 2015
 */
public class CDPlayer {
	
	Scanner sc = new Scanner(System.in); 
	private Song currentSong; 
	private Playlist p; 
	private CD c; 
	
	public Playlist getPlaylist()
	{
		return p; 
	}
	
	public void setPlaylist(Playlist p)
	{
		if (p.getSongNum() != 0)
		{
			this.p = p; 
			this.currentSong = p.getNextSongToPlay(); 
			p.getPlaylist().remove(); 
		}
		else 
			System.err.println("Please don't add empty playlist.");
		
	}
	
	public CD getCD()
	{
		return c; 
	}
	
	public void setCD(CD c)
	{
		this.c = c; 
		String ch; 
		System.out.println("Would you like to add the CD into playlist?(Y/N)");
		ch = sc.next(); 
		
		if (ch.compareToIgnoreCase("Y") == 0)
		{
			this.addCDintoPlaylist();
		}
		
	}

	public CDPlayer(Playlist p)
	{
		this.setPlaylist(p);
	}
	
	public CDPlayer(CD c)
	{
		this.setCD(c);
	}
	
	public CDPlayer(CD c, Playlist p)
	{
		this.setPlaylist(p);
		this.setCD(c);
	}
	
	public boolean addSong(Song song)
	{
		this.p.addSong(song);
		return true; 
	}
	
	public void removeSong()
	{
		this.p.removeSong();
	}
	
//	public void removeSong(Song song)
//	{
//		this.p.removeSong(song);
//	}
//	
//	public void playSong(Song s)
//	{
//		if (p.getPlaylist().contains(s))
//		{
//			System.out.printf("Now playing %s...", s.toString()); 
//			this.currentSong = s; 
//			this.p.removeSong(s);
//		}
//		else 
//		{
//			System.out.println("The song is not in the list."); 
//			this.playSong();
//		}
//	}
	
	public void playSong()
	{
		if (this.p.getSongNum() > 0)
		{
			currentSong = this.p.getNextSongToPlay(); 
			System.out.printf("Now playing %s...", currentSong.toString()); 
			this.p.removeSong();
		}
		else 
		{
			System.out.println("The playlist is empty. The system add CD into playlist automatically."); 
			this.addCDintoPlaylist();
		}
	}
	
	public void displayPlaylist()
	{
		System.out.print(this.p.toString()); 
	}
	
	public void addCDintoPlaylist()
	{
		this.p.addCD(this.c);
	}
	
	public Song getCurrentSong()
	{
		return currentSong; 
	}
	
	
}
