public class Rectangle
{
   private double length;
   private double width;
   private static int numberOfRectangles;
   
   //constructor
   
   public Rectangle()
   {
      this.length = 0.0;
      this.width = 0.0;
      this.numberOfRectangles = 0;
      numberOfRectangles++;
   }
   
   public Rectangle(double width, double length)
   {
      this.width = width;
      this. length = length;
      numberOfRectangles++;
   }
   
   //setter
   
   public void setWidth(double width)
   {
      this.width = width;
   }
   
   public void setLength(double length)
   {
      this.length = length;
   }
   
   //getter
   
   public double getWidth()
   {
      return(this.width);
   }
   
   public double getLength()
   {
      return(this.length);
   }
   
   public double getArea()
   {
      return(this.width*this.length);
   }
   
   public double getPerimeter()
   {
      return(2*(this.length+this.width));
   }
   
   public int getNumberOfRectangles()
   {
      return(this.numberOfRectangles);
   }
   
   @Override
   public boolean equals(Object otherObject)
   {
      if(otherObject == null)
      {
         return(false);
      }
      else if(this.getClass() != otherObject.getClass())
      {
         return(false);
      } 
      
      Rectangle otherRectangle = (Rectangle)otherObject;
      
      if(this.getPerimeter() == otherRectangle.getPerimeter())
      {
         return(true);
      } 
      else
      {
         return(false);
      }
   }
   
   @Override
   public String toString()
   {
      return("The dimensions of the rectangle are as follows:"+
           "\nWidth = " + this.width+
           "\nLength = " +this.length+
           "\nArea = " +this.getArea());
   }
    

}