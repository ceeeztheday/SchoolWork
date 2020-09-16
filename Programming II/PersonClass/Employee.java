public class Employee extends Person //student is sub class of person.
{                                   //person is the parent of student.
   //data members                   //person is the super class of student. 
   private int salary;
   
   //constructors
   public Employee()
   {
      super();
      salary = 0;
   }
   
   public Employee(String firstName, String lastName, int id, int salary)
   {
      super(firstName, lastName, id);
      this.salary = salary;
   }
   
   //setter
   public void setSalary(int salary)
   {
      this.salary = salary;
   }
   
   //getter
   public int getSalary()
   {
      return(this.salary);
   }
   
   @Override
   public String toString()
   {      
      return(super.toString()+
            "\nSalary: "+this.salary);
   }
   

}