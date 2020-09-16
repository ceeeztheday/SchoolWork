public class Rectangle extends Shape implements IShape
{
   //data members
   private double length;
   private double width;
   private static int numberOfRectangles = 0;//numberOfRectangles is shared by all instances of the class
   
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
   public int getNumberOfRectangles()
   {
      return(numberOfRectangles);
   }
   
   //aux meth
   @Override
   public void displayPoints(){}
   @Override
   public void displayObjectType()
   {
      System.out.println("The object class is: "+ this.getClass());
   }
   @Override
   public double getArea()
   {
      return(this.length*this.width);
   }
   @Override
   public double getPerimeter()
   {
      return(0);
   }
   @Override
   public double getRadius()
   {
      return(0);
   }


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
      if(otherObject == null)
         return(false);
      else if(this.getClass() != otherObject.getClass())
         return(false);
      Rectangle otherRectangle = (Rectangle)otherObject;//casting
      return(this.length == otherRectangle.length &&
             this.width == otherRectangle.width); // or if(this.lenght== otherRectangle.length &&
                                                  //        this.width == otherRectangle.width)
                                                  //           return(true);
      //if: is object pointing to another object?
      //    see if there is a value in the reference variable
      //else if: see if the two objects were declared as different types
      //    for example a Rectangle and a subclass Square
      //else: objects are the same type. Do they store identical data?
      //    cast argument object to Rectangle class type
      //    compare primitive data members

   }
   
     
}
