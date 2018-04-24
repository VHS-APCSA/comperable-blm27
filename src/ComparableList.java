import java.util.ArrayList;

public class ComparableList 
{
	private ArrayList<Comparable> list;
	public ComparableList()
	{
		list = new ArrayList<Comparable>();
	}
	public void add(Name name)
	{
		list.add(name);
	}
	public Comparable findFirst()
	{
		Comparable first = list.get(0);
		for(Comparable x: list)
		{
			if (x.compareTo(first) < 0)
			{
				first = x;
			}
		}
		return first;
	}
	public Comparable findLast()
	{
		Comparable last = list.get(0);
		for(Comparable x: list)
		{
			if (x.compareTo(last) > 0)
			{
				last = x;
			}
		}
		return last;
	}
}
