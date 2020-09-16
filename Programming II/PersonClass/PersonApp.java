import java.util.Scanner;
public class PersonApp
{
   public static void main(String [] args)
   {
      Scanner input = new Scanner (System.in);
      String fn;
      String ln;
      int id = 0;
      Person p1 = new Person();
      
      //user prompt
      System.out.println("Please enter first name, last name, and id of the person: ");
      fn = input.nextLine();
      ln = input.nextLine();
      id = input.nextInt();
      
      p1.setfirstName(fn);
      p1.setlastName(ln);
      p1.setid(id);
      
      
      
      //program output 
     /* System.out.println("First Name: "+ p1.getfirstName() +
                        "\nLast Name: " + p1.getlastName()+
                        "\nID: " + p1.getid());  */
                        
       System.out.println(p1);
       
       

      
      
      
      
      
      
      
      
   }
}
