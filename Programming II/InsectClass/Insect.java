public class Insect
{
   public static int c; 
   private String name;

   public Insect() 
   { 
      System.out.println(c); 
      this.name = "Bug"; 
      c += 2; 
   }
   
   public Insect(String n, int h)
   { 
      this();
      System.out.println(this.name); 
      this.name = n; 
      c += h; 
   }
   
   public String woot()
   {
      String s = this.name + " " + c;
      return s;
   }
   
   public String woot(int c)
   {
      String s = this.name + " " + c;
      
      return s;
   }
   
   public void gee(Object obj)
   {
      if (obj.getClass() == this.getClass())
      {
         Insect ins = (Insect) obj; 
         this.name += ins.name.length();
      } 
      else
         this.name += this.name.length();
      System.out.println("Insect");
    
   }

}