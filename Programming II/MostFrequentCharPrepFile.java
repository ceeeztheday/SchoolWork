public class MostFrequentCharPrepFile
{
   public static void main(String [] args)
   {
      String str = "bananas";
      System.out.println(mostFrequentChar(str));
      System.out.println(mostFrequentCharASCII(str));
     // System.out.println(mostFrequentCharAlt(str));
      System.out.println(mostFrequentCharASCII(str));
      System.out.println();
      
      System.out.println(mostFrequentChar("g8ueixbo927v"));
     // System.out.println(mostFrequentCharAlt("g8ueixbo927v")); 
      System.out.println(mostFrequentCharASCII("g8ueixbo927v"));
      System.out.println(mostFrequentCharASCII("gfgfg"));
      System.out.println();
      
      System.out.println(mostFrequentChar("brookkeeps"));
      //System.out.println(mostFrequentCharAlt("brookkeeps"));
      System.out.println(mostFrequentCharASCII("brookkeeeeps"));
      System.out.println(mostFrequentCharASCII("brookkeeps")); 
   }
   
   public static char mostFrequentChar(String s)
   {  
      int j=0, i=0, count=0, tempCount=0;
      char mostFrequent=s.charAt(0);
                
      for(i=0; i<s.length(); i++)
      {
         tempCount = 0;
      
         for(j=0;j<s.length()-1; j++)
         {
            if(s.charAt(j)==s.charAt(i))
            {
               tempCount++;
            }
            if(tempCount>count)
            {
              mostFrequent = s.charAt(i);
              count=tempCount;
            }      
         }
      }    
      return(mostFrequent);
   }
   
   public static char mostFrequentCharASCII(String s)
   {
      int j=0, i=0, load=0, max = 0, tempCount=0, count=0, a=0;
      int mostFrequent=0;
      int [] arr= new int [s.length()];
      
      for(a=0; a< arr.length; a++)
      {
         char character = s.charAt(a);
         int ascii = (int) character; 
         arr[a]= character;
      }
      for(i=0; i<arr.length; i++)
      {
         tempCount = 0;
      
         for(j=0; j<arr.length-1; j++)
         {
            if(arr[i]==arr[j])
            {
               tempCount++;
            }
            if(tempCount>count)
            {
              mostFrequent = arr[i];
              count=tempCount;
            }      
         }
      }
      return((char)mostFrequent);
   }


  /* public static char mostFrequentCharAlt(String s)
   {
      
      char c = s.charAt(0);
      

      return c;
   }*/

}