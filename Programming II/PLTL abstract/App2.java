public class App2
{
     public static void main (String[]args)
     {
      Apartment apt = new Apartment();
      apt.numOfFloors(3);
      apt.bookRoom(0, 0, true);
      apt.bookRoom(0, 2, true);
      apt.bookRoom(2, 1, true);
      apt.bookRoom(2, 2, true);
      int empty = apt.vacancies();
      System.out.println(empty);
      
     }
}