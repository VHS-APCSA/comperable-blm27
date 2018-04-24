
public class NameRunner {
	public static void main(String[] args)
	{
		ComparableList test = new ComparableList();
		test.add(new Name("bill", "peters"));
		test.add(new Name("bill", "jones"));
		test.add(new Name("barry", "jackson"));
		test.add(new Name("bob", "jones"));
		//test.add(new Name("john", "doe"));
		test.add(new Name("john", "jackson"));
		Name output = new Name();
		output =  (Name) test.findFirst();
		System.out.println(output.getFirstName() + ", " + output.getLastName());
	}
}