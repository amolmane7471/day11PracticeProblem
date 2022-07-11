package day11PracticeProblem;
import java.util.Scanner;
public class StockAccount {

	static double amount = 0;

	Scanner scan = new Scanner(System.in);
	/*\
	 *  getter and setter for amount
	 */
	public static double getAmount() {
		return amount;
	}

	public static void setAmount(double amount) {
		StockAccount.amount = amount;
	}
/*
 * method to credit account
 * assigning amount balance to temp
 * adding the temp amount with credit amount
 * setting the amount with setters
 * displaying the amount with the help of getters 
 */
	public static void credit(double credit_value) {                              

		double temp_amount = StockAccount.getAmount();                                
		temp_amount += credit_value;                                            
		StockAccount.setAmount(temp_amount);                                           
		System.out.println(" Updated amount: " + StockAccount.getAmount());           
	}
	/*
	 * method to debit account balance
	 */
	public static boolean debit(double debit_value) {                             

		if (StockAccount.getAmount() - debit_value < 0) {                              
			System.out.println(" Insufficient funds!");
			return false;
		}
		/*
		 *  assigning the account balance to temp
		 *  debit the account 
		 *  setting the amount
		 */

		double temp_amount = StockAccount.getAmount();                                 
		temp_amount -= debit_value;                                               
		StockAccount.setAmount(temp_amount);                                           

		return true;
	}

}