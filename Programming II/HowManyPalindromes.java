public class HowManyPalindromes
{
   public static void main(String[]args)
   {
      String [] s1 = {"ot", "mary", "tot"};
      
      int i = 0;
      int j = 0;
      int a = 0;
      int count = 0;
      int count1 = 0;
      
      for(a=0; a<s1.length; a++)
      {
         j=s1[a].length()-1;
         count = 0;
         for(i=0; i<s1[a].length(); i++)
         {
        
            
            if(s1[a].charAt(i)==s1[a].charAt(j))
            {
               count++;
            }
            j--;
            
            
            if(count == s1[a].length())
            {
               count1++;
            }
         
         }
      }
      
      System.out.println(count1);
   }

}
