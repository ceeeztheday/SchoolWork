import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.math.*;
import java.util.*;

public class InCommon
{
   public static void main(String [] args)
   {
      String s1 = "hellojane";
      //String s2 = "heloanedjan";
      int count1 = 0;
      //int count2 = 0;
      char c;
      String temp = s1;
      
      //for(int i = 0; i < s1.length(); i++)
      //{
      while(s1.length() > 0)
      {
         c = s1.charAt(0);
         count1 = s1.length();
         s1 = s1.replace(c + "" , "");
         count1 = count1 - s1.length();
         System.out.println(c + "\t: " + count1);
      }
      //}
   }
}