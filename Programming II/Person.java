public class Person
{
   private String firstName;
   private String lastName;
   private int id;
   
   public Person()
   {
      this.firstName = "";
      this.lastName = "";
      this. id = 0;
   }
   
   public Person(String firstName, String lastName, int id)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
   }
   
   //setter
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public void setId(int id)
   {
      this.id = id;
   }
   
   //getter
   public String getFirstName()
   {
      return(this.firstName);
   } 
   
   public String getLastName()
   {
      return(this.lastName);
   }
   
   public int getId()
   {
      return(this.id);
   } 
   
   @Override
   public String toString()
   {
      return("First Name: "+ this.firstName+
           "\nLast Name: "+ this.lastName+
           "\nID: "+this.id);
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
   
   Person otherPerson = (Person)otherObject;
   
   if(this.firstName == otherPerson.firstName &&
      this.lastName == otherPerson.lastName &&
      this.id == otherPerson.id)
   {
      return(true);
   }
   else
   {
      return(false);
   }
  }
}