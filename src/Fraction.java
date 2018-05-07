
public class Fraction implements Comparable
{
	private int num;
	private int denominator;
	public Fraction()
	{
		this.num = 0;
		this.denominator = 0;
	}
	public Fraction(int num, int denominator)
	{
		this.num = num;
		this.denominator = denominator;
	}
	public int getNum()
	{
		return num;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public double getDecimal()
	{
		return (double)num/denominator;
	}
	@Override
	public int compareTo(Object obj)
	{
		Fraction dec = (Fraction)obj;
		if (this.getDecimal() > dec.getDecimal())
		{
			return 1;
		}
		else if (this.getDecimal() < dec.getDecimal())
		{
			return -1;
		} 
		else
		{
			return 0;
		}
	}
}

