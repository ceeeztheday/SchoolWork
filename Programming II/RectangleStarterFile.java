public class RectangleStarterFile
{
   //data members
   private double length;
   private double width;
         //numberOfRectangles is shared by all instances of the class
   
   //constructors
   public Rectangle()
   {
      length = 0.0;
      width = 0.0;
      numberOfRectangles++;
   }
   public Rectangle(double len, double wid)
   {
      length = len;
      width = wid;
      numberOfRectangles++;
   }
   
   //get and set methods (getters and setters)

   
   @Override
   public String toString()
   {               
      return("The dimensions of the rectangle are as follows:" +
             "\nwidth = " + width +
             "\nlength = " + length);
   }

   @Override
   public boolean equals(Object otherObject)
   {
      //if: is object pointing to another object?
      //    see if there is a value in the reference variable
      //else if: see if the two objects were declared as different types
      //    for example a Rectangle and a subclass Square
      //else: objects are the same type. Do they store identical data?
      //    cast argument object to Rectangle class type
      //    compare primitive data members

   }  
}
