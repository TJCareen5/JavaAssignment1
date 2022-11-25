import java.util.Scanner;
/**
 * JAVA DOC
 * Tester for Account class
 * This test will print out the starting balance of each account then let you debit money
 * out of the account or credit money into the account by using a negative debit amount
 * It will then print out the new balances for each account
 *
 * @author student #20172422
 */
public class AccountTest{
    /** main method starts program */
    public static void main(String[] args) {
        Account account1 = new Account("Peter Piper's", 250.00 );
        Account account2 = new Account( "Paula Cooper's", 75.00);

        /** display starting balance of each Account */
        System.out.printf( "%s balance: $%.2f\n", account1.getName(), account1.getBalance() );
        System.out.printf( "%s balance: $%.2f\n", account2.getName(), account2.getBalance() );

        /** create Scanner to obtain input from command window */
        Scanner inputWithdraw = new Scanner ( System.in );
        double withdrawAmount; /** debit amount read from user */

        Scanner inputAmount = new Scanner ( System.in );
        double amount; /** credit amount read from user */

        System.out.print( "Enter withdraw amount for Peter Piper's Account: " );
        withdrawAmount = inputWithdraw.nextDouble();
        System.out.printf("\ndeducting %.2f from Peter Piper's balance\n", withdrawAmount );
        account1.debit(withdrawAmount); /** deduct from Account #1 balance */

        /** display balances */
        System.out.printf( "%s balance: $%.2f\n", account1.getName(), account1.getBalance() );
        System.out.printf( "%s balance: $%.2f\n", account2.getName(), account2.getBalance() );

        System.out.print( "Enter withdraw amount for Paula Cooper's Account: "); // prompt
        withdrawAmount = inputWithdraw.nextDouble();
        System.out.printf( "\ndeducting %.2f from Paula Cooper's balance\n", withdrawAmount );
        account2.debit(withdrawAmount); /** deduct from Account #2 balance */

        /** display balances */
        System.out.printf( "%s balance: $%.2f\n", account1.getName(), account1.getBalance() );
        System.out.printf( "%s balance: $%.2f\n", account2.getName(), account2.getBalance() );

        System.out.print( "Enter credit amount for Peter Piper's Account: " );
        amount = inputAmount.nextDouble();
        System.out.printf("\nAdding %.2f to Peter Piper's balance\n", amount );
        account1.credit(amount); /** add to Account #1 balance */

        /** display balances */
        System.out.printf( "%s balance: $%.2f\n", account1.getName(), account1.getBalance() );
        System.out.printf( "%s balance: $%.2f\n", account2.getName(), account2.getBalance() );

        System.out.print( "Enter Credit amount for Paula Cooper's Account: ");
        amount = inputAmount.nextDouble();
        System.out.printf( "\nAdding %.2f to Paula Cooper's balance\n", amount);
        account2.credit(amount); /** add to Account #2 balance */

        /** display balances */
        System.out.printf( "%s balance: $%.2f\n", account1.getName(), account1.getBalance() );
        System.out.printf( "%s balance: $%.2f\n", account2.getName(), account2.getBalance() );
    }
}
