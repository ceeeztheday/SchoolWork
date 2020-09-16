public class Circle
{
   //data members
   private double radius;
   
   //constructors
   
   public Circle()
   {
      radius = 1;
   }
   
   public Circle(double radius)
   {
      this.radius = radius;
   }
   
   //Sets
    public void setRadius(double radius)
   {
      this.radius = radius;
   }
   
   //aux methods
   public double getArea()
   {
      return(radius*radius*Math.PI);
   }
   
   public double getPerimeter()
   {
      return(2*radius*Math.PI);
   }
   
   //String to String
   @Override
   public String toString()
   {
      return("Area is: "+ this.getArea()+
           "\nPerimeter is : "+this.getPerimeter());
   }

   
   
   
   







}