public class Student
{
   //data members
   private String firstName;
   private String lastName;
   private int ssn;
   private double gpa;
   
   private static int studentCount = 0;
   
   //constructors
   public Student( )
   {
      this.firstName = " ";
      this.lastName = " ";
      this.ssn = 0;
      this.gpa = 0.0;
      studentCount++;
   }
   public Student(String firstName, String lastName, int ssn, double gpa)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.ssn = ssn;
      this.gpa = gpa;
      studentCount++;
   }
   //get and set methods
   public String getFirstName ( ) {return this.firstName; }
   public String getLastName ( ) {return this.lastName; }
   public int getSsn ( ){return this.ssn; }
   public double getGpa ( ) {return this.gpa; }
   public void setFirstName(String firstName) { this.firstName = firstName; }
   public void setLastName(String lastName) {this.lastName = lastName; }
   public void setSsn (int ssn) {this.ssn = ssn; }
   public void setGpa (double gpa) {this.gpa = gpa; }
   
   //auxilary methods
   public static void showStudentCount( )
   {
      System.out.println("The number of student is: " + studentCount);
   }
   
   @Override
   public String toString()
   {
      String message = "\nFirst Name: " + this.firstName +
                       "\nLast Name: " + this.lastName +
                       "SSN: " + this.ssn +
                       "GPA: " + this.gpa;
                       
      return (message);
   }

   public boolean equals (Object obj)//obj is set to s2
   {
      if(obj == null)
         return (false);
      
      if(this.getClass() != obj.getClass())
         return (false);
         
      Student otherStudent = (Student)obj;
      
      return(this.firstName.equals(otherStudent.firstName) &&
             this.lastName.equals(otherStudent.lastName) &&
             this.ssn == otherStudent.ssn &&
             this.gpa == otherStudent.gpa);
   }  
}