package ch8_Q3_Jukebox;

import java.util.Set;

/**
 * An implementation of the Jukebox
 * @author yutian
 *
 */
public class Jukebox {
	
	private CDPlayer cdPlayer; 
	private User user; 
	private Set<CD> cdCollection; 
	
	public Jukebox(CDPlayer cdplayer, User user, Set<CD> cdcollection, SongSelector ts)
	{
		this.cdPlayer = cdplayer; 
		this.user = user; 
		this.cdCollection = cdcollection; 
	}
	
	public Song getCurrentSong()
	{
		return cdPlayer.getCurrentSong(); 
	}
	
	public void setUser(User u)
	{
		this.user = u; 
	}

}
