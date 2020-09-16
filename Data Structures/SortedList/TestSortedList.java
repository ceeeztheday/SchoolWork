
// The test driver for the SortedList class
import java.io.*; // Serializable interface
import java.util.Scanner;

public class TestSortedList {
    public static void main(String[] args) {
        SortedList mylist = new SortedList();
        Scanner conIn = new Scanner(System.in);
        int value;

        System.out.println("Enter a few numbers you wish to insert (enter -1 to stop):");
        while ((value = conIn.nextInt()) != -1)
            mylist.add(value);

        System.out.println(mylist);

        // write the list to a file
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SortedList.txt"));
            out.writeObject(mylist);
            out.close();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        // read the list from a file
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("SortedList.txt"));
            mylist = (SortedList) in.readObject();
            System.out.println(mylist);
            in.close();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        System.out.print("Enter a number you wish to delete: ");
        value = conIn.nextInt();

        if (mylist.remove(value))
            System.out.println(mylist);
        else
            System.out.println("The number is not found.");
    }
}