public class Country {
   // data members
   private String name;
   private int pop;
   private String capital;

   // constructors
   public Country() {
      this.name = "";
      this.capital = "";
      this.pop = 0;
   }

   public Country(String name, String capital, int pop) {
      this.name = name;
      this.capital = capital;
      this.pop = pop;
   }

   // get and set methods
   public String getName() {
      return this.name;
   }

   public String getCapital() {
      return this.capital;
   }

   public double getPop() {
      return this.pop;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setCapital(String capital) {
      this.capital = capital;
   }

   public void setPop(int pop) {
      this.pop = pop;
   }

   @Override
   public String toString() {
      String message = "\nname: " + this.name + "\tpopulation: " + this.pop + "\tcapital: " + this.capital;

      return (message);
   }

   @Override
   public boolean equals(Object otherObject) {
      if (otherObject == null) // is it pointing at another object
         return (false);

      if (this.getClass() != otherObject.getClass()) // are the two objects of the same class type?
         return (false);

      Country otherCountry = (Country) otherObject; // cast to current class type

      // compare variable by variable
      if (this.name.equals(otherCountry.name) && this.capital.equals(otherCountry.capital)
            && this.pop == otherCountry.pop)
         return (true);

      return (false);
   }
}