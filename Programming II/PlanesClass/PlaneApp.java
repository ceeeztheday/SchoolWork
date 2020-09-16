public class PlaneApp
{
   public static void main(String [] args)
   {
      Plane p = null;
      Plane cc = new Plane("Coolness Cruiser");
      System.out.print("Plane p is: ");
      System.out.println(p);
      System.out.print("Plane cc is: ");
      System.out.println(cc);
      System.out.println("/****************/");
      CargoPlane cp1 = new CargoPlane();
      CargoPlane cp2 = new CargoPlane("Dottie", "Commercial");
      Plane p1 = new CargoPlane("Chug", cp1.getType());
      Plane p2 = new Plane("Echo", 787);
      Plane [] planes = {p, cp1, cp2, p1, p2, null};
      System.out.println("/****************/");
      planes[0] = cp2;
      System.out.println(cp1.equals(planes[0]));
      cp1.displayProperties();
      System.out.println(planes[0]);
      System.out.println("Fly the friendly skies");
      System.out.println("/****************/");
   }
}