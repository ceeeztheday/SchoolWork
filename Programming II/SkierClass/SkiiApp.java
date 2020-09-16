public class SkiiApp
{
   public static void main(String[]args)
   {
      Skier s1 = new Skier(2831);
      s1.printSkierId();
      s1.setScores("80.2 100.3 60.4 32.2");
      double d1 = s1.sumScores();
      System.out.println(d1 + "\n");
      Skier s2 = new Skier(30184);
      s2.printSkierId();
      s2.setScores("77.3 90.2 54.2");
      double d2 = s2.sumScores();
      System.out.println(d2 + "\n");
      System.out.println(s1.equals(s2));
      s2.setScores("133.5 139.6");
      d2 = s2.sumScores();
      System.out.println(d2);
      System.out.println(s1.equals(s2));
   }
}