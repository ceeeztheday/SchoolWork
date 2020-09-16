public class Foods
{
   //data members
   private String name;
   private double price;
   private int quantity;
   
   //Constructors
   public Foods()
   {
      name = null;
      price = 0;
      quantity = 0;
   }
   
   public Foods(String name, double price, int quantity)
   {
      this.name = name;
      this.price = price;
      this.quantity = quantity;
   }
   
   // set methods
   public void setName(String name)
   {
      this.name = name;
   }
   
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   public void setQuantity(int quantity)
   {
      this.quantity = quantity;
   }
   
   //get methods
   public String getName()
   {
      return(this.name);
   }
   
   public double getPrice()
   {
      return(this.price);
   }
   
   public int getQuantity()
   {
      return(this.quantity);
   }
   
   //toString
   @Override
   public String toString()
   {
      return("food type: "+this.name+
            "\nprice: "+ this.price+
            "\nquantity: "+this.quantity);
      
   }
   
   
   
}