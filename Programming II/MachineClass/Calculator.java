public class Calculator extends Machine {
   // data
   private static int calculatorCount = 0;

   // constructors
   public Calculator() {
      calculatorCount++;
   }

   public Calculator(boolean isOn)// this will be on the final exam!!
   {
      // this.isOn = isOn;
      super();
      this.setIsOn(true);
      calculatorCount++;
   }

   // aux
   public static int getCalculatorCount() {
      return (calculatorCount);
   }

   @Override
   public void setIsOn(boolean isOn) {
      this.setIsOn(false);
      super.turnOn();
   }

   @Override
   public void turnOff() {
      this.setIsOn(false);
      super.turnOff();
   }

   @Override
   public boolean isOn() {
      return (super.isOn());
   }

   @Override
   public void displayIsOn() {
      if (getIsOn() == true) {
         System.out.println("The current state of the calculator is on.");
      } else {
         System.out.println("The current state of the calculator is off.");
      }
   }

   @Override
   public String toString() {
      if (isOn == true) {
         return ("The calculator is on and all is functioning well.");
      } else {
         return ("The calculator is off and it is not functioning at the moment.");
      }
   }
}