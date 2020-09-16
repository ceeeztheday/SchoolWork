import java.util.Scanner;
public class RectangleApp
{
public static void main(String [] args)
{
//instantiate two Rectangle objects
Rectangle r1 = new Rectangle(); //no-arg constructor
Rectangle r2 = new Rectangle(6.0, 3.0); //two-arg constructor
Scanner kbd = new Scanner(System.in);
double a = 0.0;
double b = 0.0;
System.out.println("Please enter a width and length");
a = kbd.nextDouble();
b = kbd.nextDouble();
Rectangle r7 = new Rectangle(a, b);
System.out.println("DISPLAY r1 AND r2 DATA\n\n");
System.out.println("r1 length = " + r1.getLength());
System.out.println("r1 width = " + r1.getWidth());
//see data in r1 and r2
System.out.println("The values stored in r1 are: " +
"\nlength = " + r1.getLength() +
"\nwidth = " + r1.getWidth());
//r1.printAreaMessage();
System.out.println("The values stored in r2 are: " +
"\nlength = " + r2.getLength() +
"\nwidth = " + r2.getWidth());
//r2.printAreaMessage();
//System.out.println("\nThe number of Rectangle objects now is: "
//+ Rectangle.getNumberOfRectangles() );
//test for equality
System.out.println("\n\nTEST FOR EQUALITY OF r1 AND r2\n\n");
if(r1.equals(r2))
System.out.println("r1 and r2 are equal");
else
System.out.println("r1 and r2 are not equal");
//set new data values for r1
r1.setLength(2.0);
r1.setWidth(3.0);
System.out.println("The values stored in r1 are: " +
"\nlength = " + r1.getLength() +
"\nwidth = " + r1.getWidth());
//r1.printAreaMessage();
//assign the values of r2 to r1
System.out.println("\n\nASSIGN NEW VALUES TO r1 AND r2\n\n");
r1.setLength(r2.getLength());
r1.setWidth(r2.getWidth());
System.out.println("The values stored in r1 are: " +
"\nlength = " + r1.getLength() +
"\nwidth = " + r1.getWidth());
//r1.printAreaMessage();
//demo Object level toString()
System.out.println("\n\nDISPLAY OBJECT CLASS toString( ) INFORMATION\n\n");
System.out.println("Object toString method");
System.out.println(r1.toString());
//demo Overwritten toString() method
System.out.println("\n\nDISPLAY RECTANGLE CLASS OVERRIDDEN toString( ) INFORMATION\n\n");
System.out.println(r1);
System.out.println("\n\nTEST OBJECT CLASS OVERRIDDEN EQUALS METHOD\n\n");
if(r1.equals(r2))
System.out.println("r1 and r2 are equal");
else
System.out.println("r1 and r2 are not equal");
Rectangle r4 = new Rectangle();
Rectangle [ ] ra = {new Rectangle(), new Rectangle(3, 5), new Rectangle()};
//System.out.println(Rectangle.getNumberOfRectangles());
System.out.println(r1.getNumberOfRectangles());
System.out.println(ra[0].getNumberOfRectangles());
}
}