public class Rectangle
{
   //data members
   private double length;
   private double width;
   private static int numberOfRectangles = 0; //shared by all instances of the class
   
   //constructors
   public Rectangle()
   {
      length = 0.0;
      width = 0.0;
      numberOfRectangles++;
   }
   public Rectangle(double wid, double len)
   {
      width = wid;
      length = len;
      numberOfRectangles++;
   }
   
   //get methods 
   public double getLength()
   {
      return(this.length);
   }
   public double getWidth()
   {
      return(width);
   }
   
   //set methods
   public void setLength(double len)
   {
      this.length = len;
   }
   public void setWidth(double wid)
   {
      width = wid;
   }
   
   //auxiliary methods
   public double getArea()
   {
      return(length * width);
   }
   public double getPerimeter()
   {
      return(2 * (this.length + this.width));
   }
   public void printAreaMessage()
   {
      System.out.println("The area is: " + this.getArea());
   }
   public static int getNumberOfRectangles()
   {
      return(numberOfRectangles);
   }
   @Override
   public String toString()
   {               
      return("The dimensions of the rectangle are as follows:" +
             "\nwidth = " + width +
             "\nlength = " + length + 
             "\narea = " + this.getArea());
   }
   //below is the original equals method
   /* 
   public boolean equals(Object otherObject)
   {
      boolean isEqual = false;   //default setting
      
      //test to see if argument is pointing to an object
      //if so, test to see if argument is pointing
            //to an object of type Rectangle
      if( (otherObject !=null ) &&
            (otherObject instanceof Rectangle))
      {  //since argument is sent in as type Object,
         // cast object level to Rectangle level
         Rectangle otherRectangle = (Rectangle)otherObject;
         
         //test equality of primitive data types   
         if(this.length == otherRectangle.length &&
            this.width == otherRectangle.width)
            isEqual = true;
      }
      return(isEqual);      
   }*/
   
   //below is a better equals method
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
      if(otherObject == null)
         return false;        
      else if(this.getClass() != otherObject.getClass()) 
         return false;
      else
      {
         Rectangle otherRectangle = (Rectangle)otherObject;
         return(this.length == otherRectangle.length &&
                this.width == otherRectangle.width);
      }
   }  
}
