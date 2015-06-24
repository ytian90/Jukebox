package ch8_Q3_Jukebox;

import java.util.Scanner;
/**
 * Test Program to test the CDPlayer. 
 * @author yutian
 * @since Jun 23, 2015
 */
public class Test {

	public static void main(String[] args) {
		
		String[] songs1 = {
				"See You Again",
				"Bad Blood",
				"Trap Queen",
				"Shut Up And Dance",
				"Want To Want Me",
				"Cheerleader",
				"Earned It",
				"Hey Mama", 
				"Honey, I'm Good", 
				"Watch Me", 
				"Sugar", 
				"You Know You Like It"
		};
		
		String[] songs2 = {
				"Honey, I'm Good", 
				"Watch Me", 
				"Sugar", 
				"You Know You Like It",
				"Talking Body", 
				"Worth It",
				"Where Are U Now", 
				"Post To Be", 
				"Nasty Freestyle", 
				"Fight Song", 
				"Lean On", 
				"Thinking Out Loud"
		};
		
		System.out.println("Welcome to CD Player System!"); 
		System.out.println("The system autamatically import 2 CDs into the playlist. Enjoy them!"); 
		
		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = new Scanner(System.in); 
		
		// Create CDs, songs to test
		CD cd1 = new CD(); 
		CD cd2 = new CD();  
		cd1.makeCD(songs1);
		cd2.makeCD(songs2);
		
		Playlist playlist = new Playlist(cd1);
		playlist.addCD(cd2);
		
		CDPlayer cdplayer = new CDPlayer(playlist); 
		
		cdplayer.playSong();
		System.out.print("\n\n"); 
		cdplayer.displayPlaylist();
		
		int choice = 0; 
		
		System.out.println("\nPlease choose:\n\t1: Play the next song\n\t2: Add a new song\n\t3: Show playlist\n\t0: Exit");
		choice = sc1.nextInt(); 
		
		while (choice != 0)
		{
			switch (choice)
			{
			case 1:
				cdplayer.playSong();
				break; 
			case 2:
				System.out.println("Please enter the name of the song to add:"); 
				String SongName = sc2.next(); 
				Song song = new Song(SongName); 
				if (cdplayer.addSong(song))
					System.out.printf("%s has been added to the playlist.", SongName); 
				break; 
			case 3: 
				cdplayer.displayPlaylist();
			default:
				break; 
			}
			
			System.out.println("\nPlease choose:\n\t1: Play the next song\n\t2: Add a new song\n\t3: Show playlist\n\t0: Exit");
			choice = sc1.nextInt(); 
			
		}
		
		sc1.close();
		sc2.close();

	}

}
