//Cesar Arroyo
//Programming II

public class Letters
{
   //data members
   private String motto;
   
   //constructors
   public Letters(String str, int a)
   {
      this.motto = str;
   }
   
   //auxillary method
   public void printVowels()
   {
      int vowelCount = 0;
      
      for(int i = 0; i < motto.length(); i++)
      {
         if(motto.charAt(i) == 'a' || motto.charAt(i) == 'e' ||
            motto.charAt(i) == 'i' || motto.charAt(i) == 'o' ||
            motto.charAt(i) == 'u')
         {
            System.out.print(motto.charAt(i) + " ");
            vowelCount++;
         }
      }
      if(vowelCount == 0)
      {
         throw new IllegalStateException("No Vowels");
      }
      else
      {
         System.out.println();
      }
   }
   //end printVowel() method
   
   @Override
   public boolean equals(Object obj)
   {
      if(obj == null)   //test for nulity
         return (false);
      if(this.getClass() != obj.getClass())  //test for class type
         return (false);
         
      Letters newLetters = (Letters)obj;
      
      //test for variable equality
      if(this.motto.equals(newLetters.motto))
         return(true);
      
      return(false);
   }
}