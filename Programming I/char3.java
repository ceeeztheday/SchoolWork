public class char3
{
   public static void main(String [] args)
   {
      char [] text = {'k', 'e', 'n', 's'};
      int [] freq = {2, 3, 4, 5};
      int i = 0;
      int j = 0;
      int k = 0;
      int sum = 0;
      int z = 0;
      
      for(i = 0; i <freq.length; i++)
      {
         sum = sum + freq[i];
      }
                 
       char [] b = new char [sum];
       
       for(i = 0; i <text.length; i++)
       { 
         for(j = 0; j < freq[i]; j++)
         {
            b[k]=text[i];
            System.out.print(b[k]);
            k++;
         }
       }
    }
}
      


   
   
   
   
   
   
