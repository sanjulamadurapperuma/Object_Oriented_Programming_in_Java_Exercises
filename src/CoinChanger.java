//Author - Sanjula Madurapperuma
import java.util.Scanner;

public class CoinChanger {
    public static void main(String[] args)
    {
        // get user input of item amount and amount given
        Scanner myScanner = new Scanner(System.in);
        System.out.print("\nEnter the total amount of the item: ");
        double totalAmt = myScanner.nextDouble();
        System.out.print("Enter the amount given to the cashier: ");
        double amtGiven = myScanner.nextDouble();

        // define variables for coins
        double quarter = 0.25;
        double nickel = 0.05;
        double dime = 0.10;
        double penny = 0.01;

        // round changeDue to 2 decimal places and calculate the modulus in a hierarchy
        double changeDue = ( (double)((int) Math.round((amtGiven - totalAmt)*100)) / 100.0 );
        double modQuarters = ( (double)((int) Math.round((changeDue % quarter)*100)) / 100.0 );
        double modDimes = ( (double)((int) Math.round((modQuarters % dime)*100)) / 100.0 );
        double modNickels = ( (double)((int) Math.round((modQuarters % nickel)*100)) / 100.0 );
        double modPennies = ( (double)((int) Math.round((modQuarters % penny)*100)) / 100.0 );

        // count number of coins
        int numQuarters = (int)((changeDue - modQuarters) / (quarter));
        int numDimes = (int)((modQuarters - modDimes) / (dime));
        int numNickels = (int)((modDimes - modNickels) / (nickel));
        int numPennies = (int)((modNickels - modPennies) / (penny));

        // return information to user
        System.out.println("\nTotal amount of change to give: " + changeDue);
        System.out.println("Number of quarters to give: " + numQuarters);
        System.out.println("Number of dimes to give: " + numDimes);
        System.out.println("Number of nickels to give: " + numNickels);
        System.out.println("Number of pennies to give: " + numPennies);

    }
}
