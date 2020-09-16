public class Printer extends Machine {
   // data
   private String modelNum;
   public static int pCount = 0;

   public Printer(boolean isOn, String modelNum) {
      this.isOn = isOn;
      this.modelNum = modelNum;
      pCount++;
      System.out.println("A new printer has been created.");
   }

   @Override
   public void turnOn() {
      System.out.println("Warming up printer.");
   }

   @Override
   public void turnOff() {
      System.out.println("Shutting down printer.");
   }

   @Override
   public boolean isOn() // assignment asked to have return boolean void
   {
      if (isOn == true) {
         System.out.println("Printer is on.");
      } else {
         System.out.println("Printer is off.");
      }
      return (true);
   }

   @Override
   public void displayIsOn() {
   }

   public void print(int copies) {
      int i = 0;
      while (i != copies) {
         System.out.println("The printer is printing.");
         i++;
      }
   }

   @Override
   public String toString() {
      return ("the machine is functioning properly" + "/t the printer is functioning properly");
   }
}