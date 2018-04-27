
public class FractionRunner
{
	public static Comparable largestFrac(Comparable a, Comparable b)
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
		Fraction f1 = new Fraction(4,2);
		Fraction f2 = new Fraction(4,4);
		Fraction output = new Fraction();
		output =  (Fraction) largestFrac(f1, f2);
		System.out.println(output.getNum() + "/" + output.getDenominator() +
				" ---> " + output.getDecimal() + " is the largest.");
	}
}
