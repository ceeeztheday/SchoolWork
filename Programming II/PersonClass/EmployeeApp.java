public class EmployeeApp
{
   public static void main(String []args)
   {
      Employee e1 = new Employee("Robert", "Ruiz", 50, 8977);
      Person p1 = new Person("Mary", "Ruiz", 5);
      Student s1 = new Student ("Robert", "Velazquez", 1, 4.0);
      
      System.out.println(p1);
      System.out.println();
      System.out.println(s1);
      System.out.println();
      System.out.println(e1);
   }
}