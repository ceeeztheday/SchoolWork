public class Strings2 {
   public static void main(String[] args) {

      // Parse name into first and last name use index of() to store name into new
      // varaible
      String fullName = "    John Whozwatsit   ";

      fullName = fullName.trim();
      int a = fullName.indexOf(" ");
      String firstName = fullName.substring(0, a);
      System.out.println(firstName);

      // trim
      // parse address into first a string array, than into independent variables
      String address = "   405 Main Street\tDallas\tTX\t12345     ";

      address = address.trim();
      String[] arr = address.split("\t");

      // trim
      // using substring, ass hypens
      // Display both numbers
      String phoneNumber1 = "    1234567098   ";

      // trim
      // using charAt() method, add hypens
      // Display both
      String phoneNumber2 = "   122-123-1234    ";

   }
}