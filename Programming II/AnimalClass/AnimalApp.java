public class AnimalApp
{
	public static void main(String args[])
   {
		Animal a = new Animal(3);
		Animal w = new Wolf(4, "Black");		
      Canine c = new Canine(22.3, "Green");
      Animal aa = new Animal(31.5, 6);
      
      c.displayProperties();
		System.out.println(a);
		System.out.println(w);
		
      System.out.println(a.equals(c));
		System.out.println(c.equals(w));
      System.out.println(Animal.animals);
	}
}



