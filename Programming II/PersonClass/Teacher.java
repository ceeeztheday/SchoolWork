public class Teacher extends Person
{
   private String course;
   
   public Teacher()
   {
      super();
      this.course = "";
   }
   public Teacher(String firstName, String lastName, int id, String course);
   {
      super(firstName, lastName, id);
      this.course = course;
   }
   public String getCourse()
   {
      return(this.course);
   }
   public void setCourse(String course)
   {
      this.course = course;
   }
   
   @Override
   public String toString()
   {
      String message = (super.toString() + 
                        "\nCourse: " + this.course);
      return message;
   }
}