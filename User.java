package ch8_Q3_Jukebox;

/**
 * An implementation of User. 
 * @author yutian
 * @since Jun 23, 2015
 */
public class User {
	
	private String name; 
	private final int id; 
	
	public User(String name, int id)
	{
		this.name = name; 
		this.id = id; 
	}

	public String getName()
	{
		return this.name; 
	}
	
	public void setName(String name)
	{
		this.name = name; 
	}
	
	public int getId()
	{
		return this.id; 
	}
	
}
