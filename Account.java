/**
 * JAVA DOC
 * Account class
 * This class is used to debit and credit money in an account,
 * Therefore changing the balance of the accounts and printing the new totals
 *
 * @author student #20172422
 */

public class Account{
    private String name; /** instance variable that stores the name */
    private double balance;    /** instance variable that stores the balance */

    /** constructor */
    public Account(String name, double balance){
        this.name = name;

        if (balance >= 0.0) {
            this.balance = balance;
        }
    }
    /** credit an amount to the account */
    public void credit(double creditAmount){
        if(creditAmount < 0 ){
            System.out.println("Credit amount CANNOT be negative.");
        }
        else balance = balance + creditAmount; /** add amount to balance */
    }
    /** debit an amount to the account */
    public void debit(double debitWithdraw){
        if (debitWithdraw > balance){
            System.out.println("Debit amount exceeded account balance.");
        }
        else if(debitWithdraw < 0 ){
            System.out.println("Debit amount CANNOT be negative.");
        }
        else if(debitWithdraw >= 0 && debitWithdraw <= balance){
            balance = balance - debitWithdraw;
        }
    }
    /** method to get balance */
    public double getBalance() {
        return balance; /** gives the value of balance to the calling method */
    }
    /** method to set name */
    public void setName(String name) {
        this.name = name;
    }
    /** method to get name */
    public String getName(){
        return name;

    }
}
