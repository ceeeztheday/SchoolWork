import java.util.Scanner;
public class Variables
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
      
      int a0 = 23;
      int a1 = 12;
      int a2 = -39;
      int x = 0;
      
      int [] a = new int [3];
      a[0] = 23;
      a[1] = 12;
      a[2] = -39;
      
      
      
      System.out.println(a1);
      System.out.println(a[1]);
      
      x = a1 - a2;
      a0 = a1 - a2;
      
      System.out.println(x);
      
      x = a[1] - a[2];
      a[0] = a[1] - a[2];
      
      System.out.println(x);
      System.out.println(a[0]);
      
      


   }
}