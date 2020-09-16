public abstract class Shape
{
   //data members
   private int pointX;
   private int pointY;
   
   //constructor
   public Shape()
   {
      pointX = 0;
      pointY = 0;
   }
   
   //aux method
   public abstract void displayPoints();
   public abstract void displayObjectType();
   
   
   @Override
   public String toString()
   {
      return("x = " + this.pointX+
             "Y = " + this.pointY);
   }
}