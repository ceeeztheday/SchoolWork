public class Person
{
   //data members
   private String firstName = null;
   private String lastName = null;
   private int id = 0;
   
   //Constructors
   public Person()
   {
      firstName= null;
      lastName=null;
      id = 0;
   }
   
   public Person(String firstName, String lastName, int id)
   {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
   }
   
   //sets
   public void setfirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public void setlastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public void setid(int id)
   {
      this.id = id;
   }
   
   //get methods
   public String getfirstName()
   {
      return(this.firstName);
   }
   
   public String getlastName()
   {
      return(this.lastName);
   }
   
   public int getid()
   {
      return(this.id);
   }
   
   //String toString
   @Override
   public String toString()
   {
      return("First Name: " + this.firstName+ 
            "\nLast Name: " + this.lastName+
            "\nID: "+ this.id);
   }
}

