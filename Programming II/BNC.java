import java.math.*;

public class BNC
{
   //constructor
   public BNC()
   {  }
   
   //methods
   public static String sumInt(String a, String b)
   {
      BigInteger b1 = new BigInteger(a);
      BigInteger b2 = new BigInteger(b);
      BigInteger result = b1.add(b2);
      
      return (result.toString());
   }
   public static String sumDec(String a, String b)
   {
      BigDecimal b1 = new BigDecimal(a);
      BigDecimal b2 = new BigDecimal(b);
      BigDecimal result = b1.add(b2);
      
      return (result.toString());
   }
   public static String differenceInt(String a, String b)
   {
      BigInteger b1 = new BigInteger(a);
      BigInteger b2 = new BigInteger(b);
      BigInteger result = b1.subtract(b2);
      
      return (result.toString());
   }
   public static String differenceDec(String a, String b)
   {
      BigDecimal b1 = new BigDecimal(a);
      BigDecimal b2 = new BigDecimal(b);
      BigDecimal result = b1.subtract(b2);
      
      return (result.toString());
   }
   public static String productInt(String a, String b)
   {
      BigInteger b1 = new BigInteger(a);
      BigInteger b2 = new BigInteger(b);
      BigInteger result = b1.multiply(b2);
      
      return (result.toString());
   }
   public static String productDec(String a, String b)
   {
      BigDecimal b1 = new BigDecimal(a);
      BigDecimal b2 = new BigDecimal(b);
      BigDecimal result = b1.multiply(b2);
      
      return (result.toString());
   }
   public static String resultInt(String a, String b)
   {
      BigInteger b1 = new BigInteger(a);
      BigInteger b2 = new BigInteger(b);
      BigInteger result = b1.divide(b2);
      
      return (result.toString());
   }
   public static String resultDec(String a, String b)
   {
      BigDecimal b1 = new BigDecimal(a);
      BigDecimal b2 = new BigDecimal(b);
      BigDecimal result = b1.divide(b2);
      
      return (result.toString());
   }
}