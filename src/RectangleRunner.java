
public class RectangleRunner
{
	public static Comparable largest(Comparable a, Comparable b)
	{
		if(a.compareTo(b) > 0)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(4,2);
		Rectangle r2 = new Rectangle(4,4);
		Rectangle output = new Rectangle();
		output =  (Rectangle) largest(r1, r2);
		System.out.println(output.getArea());
	}
}
