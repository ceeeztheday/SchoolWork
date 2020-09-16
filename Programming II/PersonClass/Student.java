public class Student extends Person //student is sub class of person.
{                                   //person is the parent of student.
   //data members                   //person is the super class of student. 
   private double gpa;
   
   //constructors
   public Student()
   {
      super();
      gpa = 0.0;
   }
   
   public Student(String firstName, String lastName, int id, double gpa)
   {
      super(firstName, lastName, id);
      this.gpa = gpa;
   }
   
   //setter
   public void setGpa(double gpa)
   {
      this.gpa = gpa;
   }
   
   //getter
   public double getGpa()
   {
      return(this.gpa);
   }
   
   @Override
   public String toString()
   {      
      return(super.toString()+
            "\nGPA: "+this.gpa);
   }
   

}