public class TeacherApp
{
   public static void main(String [] args)
   {
      Teacher t1 = new Teacher("Mary", "Smith", 25, "Astronomy");
      
      System.out.println(t1);
      Person p3 = new Person();
      Person t2 = new Teacher();
      System.out.println("t2 has the following information: ");
      System.out.println(t2);
   }
}