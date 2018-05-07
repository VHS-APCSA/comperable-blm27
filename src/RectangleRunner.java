
public class RectangleRunner
{
	public static void main(String[] args)
	{
		ComparableList test = new ComparableList();
		test.add(new Rectangle(4,4));
		test.add(new Rectangle(4,2));
		test.add(new Rectangle(8,2));
		test.add(new Rectangle(10,6));
		Rectangle output = new Rectangle();
		output =  (Rectangle) test.findLast();
		System.out.println(output.getArea() + " is the largest area.");
	}
}
