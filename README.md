# Comperable
In this assignment you will create three short projects each consisting of a class that implements the Comperable interface, a class that contains an ArrayList of Comperable objects and a runner to demonstrate the classes. You do not need to create get and set methods for the classes.

1) Create a Name class that implements the Comperable interface. The class should contain two instance variables, a first name and a last name, and a constructor to initialize them with parameters. The compareTo() method should compare the last names first and if they are the same it should then compare the first names.
Next create a ComparableList class that contains an ArrayList of Comperable objects. It should have a constructor to initialize the ArrayList, an add() method to add objects to the list, a findFirst method that returns the "smallest" object in the list as defined by the compareTo() method and a findLast method that returns the "largest" object in the list.
Finally create a runner to demonstrate how the classes work.

2) Create a Rectangle class that implements the Comperable interface. The class should contain two instance variables, a width and a length, and a constructor to initialize them with parameters. The compareTo() method should compare the areas of the rectangles.
Create a runner that uses the same ComparableList class to demonstrate how the classes work.

3) Create a Fraction class that implements the Comperable interface. The class should contain two intstance variables, a numerator and a demonimator, and a constructor to initialize them with parameters. The compareTo() method should compare the decimal equivalent of the fraction.
Create a runner that uses the same ComparableList class to demonstrate how the classes work.
