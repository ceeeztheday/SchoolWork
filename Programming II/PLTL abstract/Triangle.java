public class Triangle extends Shape
{
   private double side1, side2, side3;
   
   public Triangle(String color , double side1, double side2, double side3)
   {
      super(color);
      this.side1=side1;
      this.side2=side2;
      this.side3=side3;
      
   }
   
   public double getSide1()
   {
      return(this.side1);
   }
   
   public double getSide2()
   {
      return(this.side2);
   }
   
   public double getSide3()
   {
      return(this.side3);
   }
   
   public double getPerimeter()
   {
      return(this.side1+this.side2+this.side3);
   }
   
   @Override   
   public double findPerimeter()
   {
      return(getPerimeter());
   }
}