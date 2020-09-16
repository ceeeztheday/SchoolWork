import java.util.Scanner;
import java.text.DecimalFormat;

public class Program2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      DecimalFormat formatter = new DecimalFormat("#0.00");

      // Variables
      final double stateTax = 0.08;
      final double countyTax = 0.03;
      double total;
      double stateTaxCharged;
      double countyTaxCharged;
      double bookCost;

      // User prompt
      System.out.println("Enter the price of the book: ");
      bookCost = input.nextDouble();
      countyTaxCharged = countyTax * bookCost;
      stateTaxCharged = bookCost * stateTax;
      total = bookCost + countyTaxCharged + stateTaxCharged;

      // Program logic
      System.out.println("Book Cost: $" + formatter.format(bookCost));
      System.out.println("State Tax Charged: $" + formatter.format(stateTaxCharged));
      System.out.println("County Tax Charged: $" + formatter.format(countyTaxCharged));
      System.out.println("Total Purchase Price: $" + formatter.format(total));
   }
}
/*
 * Enter the price of the book: 10 Book Cost: $10.00 State Tax Charged: $0.80
 * County Tax Charged: $0.30 Total Purchase Price: $11.10
 * 
 * Enter the price of the book: 30 Book Cost: $30.00 State Tax Charged: $2.40
 * County Tax Charged: $0.90 Total Purchase Price: $33.30
 * 
 * Enter the price of the book: 93 Book Cost: $93.00 State Tax Charged: $7.44
 * County Tax Charged: $2.79 Total Purchase Price: $103.23
 * 
 * Enter the price of the book: 75 Book Cost: $75.00 State Tax Charged: $6.00
 * County Tax Charged: $2.25 Total Purchase Price: $83.25
 */