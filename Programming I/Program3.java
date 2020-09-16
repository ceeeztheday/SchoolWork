import java.util.Scanner;

public class Program3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Variables
    double totalInBank;
    int halfDollars;
    int quarters;
    int dimes;
    int nickles;
    int remaining;
    int cents;
    // User prompt
    System.out.println("Please enter the total dollar amount in the piggy bank: ");
    totalInBank = input.nextDouble();

    remaining = (int) (totalInBank * 100);

    halfDollars = remaining / 50;
    remaining = remaining % 50;

    quarters = remaining / 25;
    remaining = remaining % 25;

    dimes = remaining / 10;
    remaining = remaining % 10;

    nickles = remaining / 5;
    remaining = remaining % 5;

    cents = remaining;

    // Display output
    System.out.println("In $" + totalInBank + " there are: ");
    System.out.println("    " + halfDollars + " half dollars(s), " + quarters + " quarter(s), " + dimes + " dime(s), "
        + nickles + " nickle(s), and " + cents + " cents.");
  }
}
/*
 * Please enter the total dollar amount in the piggy bank: 16.72 In $16.72 there
 * are: 33 half dollars(s), 0 quarter(s), 2 dime(s), 0 nickle(s), and 2 cents.
 * 
 * Please enter the total dollar amount in the piggy bank: .93 In $0.93 there
 * are: 1 half dollars(s), 1 quarter(s), 1 dime(s), 1 nickle(s), and 3 cents.
 * 
 * Please enter the total dollar amount in the piggy bank: 78.99 In $78.99 there
 * are: 157 half dollars(s), 1 quarter(s), 2 dime(s), 0 nickle(s), and 3 cents.
 * 
 * Please enter the total dollar amount in the piggy bank: 45.89 In $45.89 there
 * are: 91 half dollars(s), 1 quarter(s), 1 dime(s), 0 nickle(s), and 4 cents.
 */
