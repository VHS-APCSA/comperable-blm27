
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
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	@Override
	public int compareTo(Object obj)
	{
		int val = 0;
		Name name = (Name)obj;

		if(lastName.compareTo(name.getLastName()) == 0)
		{
			val = firstName.compareTo(name.getFirstName());
		}
		else
		{
			val = firstName.compareTo(name.getFirstName());
		}
		return val;
	}
	public String findFirst()
	{
		String first = "";
		if( <= 1)
		{
			
		}
		
	}

}


// a findFirst method that returns the "smallest" object in the list as defined by the compareTo()
//method and a findLast method that returns the "largest" object in the list.


