import java.text.NumberFormat;

 

public class Account {

 private double balance;

  

   

  

 /**

  * constructor

  * pre: none

  * post: An account has been created.

  *

  */

 public Account(double bal) {

  balance = bal;

   

 }

  

 

 /**

  * Returns the current balance.

  * pre: none

  * post: The account balance has been returned.

  */

 public double getBalance() {

   return(balance);

 }

 

 

 /**

  * A deposit is made to the account.

  * pre: none

  * post: The balance has been increased by the amount of the deposit.

  */

 public void deposit(double amt) {

   balance += amt;

 }

 

  

 /**

  * A withdrawal is made from the account if there is enough money.

  * pre: none

  * post: The balance has been decreased by the amount withdrawn.

  */

 public void withdrawal(double amt) {

   if (amt <= balance) {

    balance -= amt;

   } else {

    System.out.println("Not enough money in account.");

   }

 }

  

  

 /**

  * Returns a String that represents the Account object.

  * pre: none

  * post: A string representing the Account object has

  * been returned.

  */

 public String toString() {

  String accountString;

  NumberFormat money = NumberFormat.getCurrencyInstance();

  accountString = "Current balance is " + money.format(balance);

   return(accountString);

 }

}

 

PersonalAcct

 
