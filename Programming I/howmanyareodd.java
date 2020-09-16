import java.util.*;
public class howmanyareodd
{

   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
     
      int b = 0;  int a = 0;
      int c = 0;
      int count = 0;
      int power = 1;
      int i = 0;
      
      System.out.print("Enter a:");
      a = input.nextInt();
      
       System.out.print("Enter b:");
       b = input.nextInt();

       /* System.out.print("Enter c:");
        c = input.nextInt();

      if(a%2!=0)
         count++;
      if(b%2!=0)
         count++;
      if(c%2!=0)
         count++;
         
         
      if(count==0)
         System.out.println("No intergers were odd.");
      else if(count==1)
         System.out.println("One intergers was odd.");
       else if(count==2)
         System.out.println("Two intergers were odd.");
       else
          System.out.println("Three intergers were odd.");
       */   
          
          
          
      /* for(i=1; i<=b; i++)  ///power
       {
         power = power *a;
       }
       System.out.print(power); 
       
       
      /* for(i=1; i<=b; i++)   ///in range product
       {
         power=power*i; 
       }
       System.out.print(power);*/
       
      
         char [] ab = {'k', 'e', 'n', 's', 'o', 't', 'a', 'k'};
 
       int [] arr = {1, 2, 3};
       int j = 0;
       
      for(i=0; i <ab.length; i++)
      {
         for(j=0; j<3; j++);
         {
            System.out.print(ab[i]);
         }
      }
      
   }
}