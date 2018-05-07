
public class FractionRunner
{
	public static void main(String[] args)
	{
		ComparableList test = new ComparableList();
		test.add(new Fraction(4,4));
		test.add(new Fraction(4,2));
		test.add(new Fraction(8,2));
		test.add(new Fraction(10,6));
		Fraction output = new Fraction();
		output =  (Fraction) test.findLast();
		System.out.println(output.getNum() + "/" + output.getDenominator() +
				" ---> " + output.getDecimal() + " is the largest.");
	}
}
