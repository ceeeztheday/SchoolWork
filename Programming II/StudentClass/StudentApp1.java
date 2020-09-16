public class StudentApp1//part3
{
   public static void main(String [] args)
   {
      Student [] s = new Student [5];
      
      s[0] = new Student();
      s[1] = new Student("Mary", "Rodriguez", 345, 3.9);
      s[3] = s[1];
      s[4] = s[0];
      
      for(int i = 0; i < s.length; i++)
         System.out.println(s[i] + "\n");
      
      s[2].showStudentCount();
      
      s[2] = new Student();
      
      s[2].setFirstName("Michael");
      
      System.out.println(s[2] + "\n");
      
      Student.showStudentCount();
   }
}