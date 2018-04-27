
public class Rectangle implements Comparable
{
	private int width;
	private int height;
	public Rectangle()
	{
		this.width = 0;
		this.height = 0;
	}
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public double getArea()
	{
		return width*height;
	}
	@Override
	public int compareTo(Object obj)
	{
		Rectangle rect = (Rectangle)obj;
		if (this.getArea() > rect.getArea())
		{
			return 1;
		}
		else if (this.getArea() < rect.getArea())
		{
			return -1;
		} 
		else
		{
			return 0;
		}
	}
}

