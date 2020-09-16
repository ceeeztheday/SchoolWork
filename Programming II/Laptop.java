public class Laptop extends Computer implements IDevice {
   private int screenSize;

   publicLaptop(String t, int m, int s)
   {
      super(t, m);
      this.screenSize = s;
   }

   @Override
   public void powerUp() {
      this.setState(true);
   }

   @Override
   public void powerDown() {
      this.setState(false);
   }

   @Override
   public void displayCurrentState() {
      // does nothing
   }

   @Override
   public void displayInfo() {
      System.out.println(this.screenSize);
   }

   @Override
   public String toString() {
      String msg = super.toString() + "\nScreen Size = " + this.screenSize + "\nState = " + this.getState();

      return (msg);
   }
}