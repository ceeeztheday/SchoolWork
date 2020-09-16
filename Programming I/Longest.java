public class Longest
{
   public static void main(String[]args)
   {
   int [] a = {1, 1, 1, 1, 2, 3};
   int i = 0;
   int temp = 0;
   int search = a[0];
   int longest = 0;
   
   for(i=0; i<a.length; i++)
   {
      if(search== a[i])
      {
         temp++;
      } 
      else
      {
         if(temp>longest)
         {
         longest = temp;
         }
         temp=1;
         search=a[i]; 
      }
      if(temp>longest)
      {
        longest=temp;
      }
    }
     
   System.out.println(longest);
   
   
   
   }
}
