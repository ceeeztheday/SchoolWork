import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumTriples
{
   static long count = 0;
}
public static void main (String [] args)
{
   Scanner in = new Scanner (System.in);
   
   Solution triples = new Solution();
   long v = 0;
   int n = 0;
   
   try
   {
      v = in.nextLong();
      n = in.nextInt();
   }
   catch(Exception e)
   {
      System.exit(1);
   }
   long [] one = new long [n];
   
   for(int i = 0; i < n; i++)
   {
      one[i] = in.nextInt();
   }
   if(n >= 3)
   {
      triples.findTriples(v, n, one);
      System.exit(0);
   }
   else
      
}