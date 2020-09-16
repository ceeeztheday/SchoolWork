public class Problem2 {
   public static void main(String[] args) {
      String s = "abcdefgh";
      String s2 = "mary mary quite";
      String newS = eliminate(s, 'a', 'd', 'g');
      String newS2 = eliminate(s2, ' ', 'q', 'y');

      System.out.println(newS);
      System.out.println(newS2);
   }

   public static String eliminate(String str, char c1, char c2, char c3) {
      String str2 = "";

      str2 = str.replace(c1 + "", "");
      str2 = str2.replace(c2 + "", "");
      str2 = str2.replace(c3 + "", "");
      return str2;
   }

}