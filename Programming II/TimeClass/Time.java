public class Time
{
   private int hours;
   private int minutes;
   private int seconds;
   
   //constructors
   public Time()
   {
      hours = 0;
      minutes = 0;
      seconds = 0;
   }
   
   public Time(int hours)
   {
      this.hours = hours;
      minutes = 0;
      seconds = 0;
   }
   
   public Time(int hours, int minutes)
   {
      this.hours = hours;
      this.minutes = minutes;
      seconds = 0;
   }
   
   public Time(int hours, int minutes, int seconds)
   {
      this.hours = hours;
      this.seconds = seconds;
      this.minutes = minutes;
   }
   
   //setters
   public void setHours(int hours)
   {
      this.hours = hours;
   }
   
   public void setMinutes(int minutes)
   {
      this.minutes = minutes;
   }
   
   public void setSeconds(int seconds)
   {
      this.seconds = seconds;
   }
   
   //getters
   public int getHours()
   {
      return(this.hours);
   }
   
   public int getMinutes()
   {
      return(this.minutes);
   }
   
   public int getSeconds()
   {
      return(this.seconds);
   }
   
   //toString
   @Override
   public String toString()
   {
      return(this.getHours()+":"+this.getMinutes()+":"+this.getSeconds());
   }
      
   
   
   
}