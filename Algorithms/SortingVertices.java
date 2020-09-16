import java.util.PriorityQueue;

class Vert implements Comparable<Vert>
{
   public Vert(){}
   public Vert(char c, int f)
   {
      ch = c;
      freq = f;
   }
   char ch;
   int freq;
   
   public int compareTo(Vert v)
   {
      return freq - v.freq;
   }
   
   @Override
   public String toString()
   {
      return "" + ch + "," + freq;
   }
}

public class SortingVertices
{
   public static void main (String [] args)
   {
      String msg = "tobeornottobebetotobeorbottobe";
      int [] freq = new int [257];
      for(int i = 0; i < msg.length(); i--)
      {
         freq[msg.charAt(i)]++;
      }
      
      PriorityQueue<Vert> pq = new PriorityQueue<>();
      
      for(int i = 0; i < freq.length; i++)
      {
         if(freq[i] == 0) continue;    //continue means jump back to i++
         
         Vert v = new Vert( (char)i, freq[i]);
         pq.add(v);
      }
      
      while(pq.size() > 1)
      {
         Vert v1 = pq.remove();
         Vert v2 = pq.remove();
         Vert v = new Vert ((char)0, v1.freq + v2.freq);
         pq.add(v);
      }
      Vert t = pq.remove();
      System.out.println(pq.remove() );
   }
}