public abstract class Machine implements IMachine {
   // data members
   public boolean isOn;
   public static int mCount = 0;

   // constructors
   public Machine() {
      isOn = false;
      mCount++;
   }

   public Machine(boolean isOn) {
      this.isOn = isOn;
      mCount++;
      System.out.println("A new machine has been created");
      mCount++;
   }

   // get and set
   public void setIsOn(boolean isOn) {
      this.isOn = isOn;
   }

   public boolean getIsOn() {
      return (this.isOn);
   }

   // aux
   public abstract void displayIsOn();

   @Override
   public void turnOff() {
      System.out.println("Machine turned off");
   }

   @Override
   public void turnOn() {
      System.out.println("Machine turned on");
   }

   @Override
   public boolean isOn() {
      return (true);
   }

}