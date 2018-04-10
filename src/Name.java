
public class Name implements Comparable
{
	private String firstName;
	private String lastName;
	public Name()
	{
		this.firstName = "";
		this.lastName = "";
	}
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public int compareTo(Object name)
	{
		
		return 0;
	}
	
}
