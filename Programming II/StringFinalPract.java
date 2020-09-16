public class StringFinalPract
{
   public static void main(String[] args)
   {
      String s = "abc";
      String s2 = "abc";
      
      int count = 0;
      
      for(int i=0; i<s2.length(); i++)
      {
        String s3 = s.replace(s2.charAt(i)+"","");
        int temp = s.length()-s3.length();
        
        if(temp != 0)
        {
         count++;
        }
                       
      }
      count = s2.length() - count;
     System.out.println(count);
    
   }
   
}
    