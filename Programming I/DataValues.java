public class DataValues
 {
 public static void main(String [] args)
 {
 //variable declaration
   int num1 = 0; 
   int num2 = 0;
   int intSum = 0;
 
   double dbl1 = 0.0;
   double dbl2 = 0.0;
   double dblDifference = 0.0;
   double dblSum = 0.0;
 
   boolean isTrue = false;
   
   char firstChar = 'a';
 
   String str = null;
  
 //program logic
   num1 = 7;
   num2 = 12;
   intSum = num1 + num2;
 
 // 7 added to 12 is 19
   System.out.println(num1 + " added to " + num2 + " is " + intSum); 
 
   dbl1 = 7.3;
   dbl2 = 75.45;
   dblDifference = dbl1 - dbl2;
   dblSum = dbl1 + dbl2;
  
 // The difference of 7.3 less 75.45 is
   System.out.println("The difference of " + dbl1 + " less " + dbl2 + " is " + dblDifference);
 
   System.out.println(firstChar);
   firstChar = 'z';
 
  double sum = 10.0;
  
  
  System.out.println(13 % 4);
 }

 }