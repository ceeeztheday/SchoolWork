public class FinalProblem6a {
   public static void main(String[] args) {
      String str = "banana";
      String str1 = "were";
      String str2 = "brookkeeps";
      System.out.println(mostFrequentChar(str));
      System.out.println(mostFrequentChar(str1));
      System.out.println(mostFrequentChar(str2));
   }

   public static char mostFrequentChar(String s) {
      int i = 0;
      char result = ' ';
      String temp = null;
      String finallength = " ";

      for (i = 0; i < s.length(); i++) {
         temp = s.replace(s.charAt(i) + "", "  ");// as loops thru replace one letter at a time with a space.
         // you cannot put two spaces because it only lets you do char to char
         // not replace the one space with two spaces(string to string)

         if (temp.length() > finallength.length())// check which length is longest
                                                  // longest word is the longest char
         {
            finallength = temp; // hold longest char
            result = s.charAt(i);
         }
      }
      return (result);
   }
}