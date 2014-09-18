package MainPackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Account {
	
	/**A private int data field named id
	*  for the account (default 0).
	*/
	private int id = 0;
			
	/**A private double data field named 
	* balance for the account (default 0).
	*/
	private double balance = 0;
			
	/**A private double data field named 
	* annualInterestRate that stores the 
	* current interest rate (default 0).
	*/
	private double annualInterestRate = 0;
			
	/**A private Date data field named dateCreated 
	* that stores the date when the account was 
	* created.
	*/
	static DateFormat Date = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
			
	private Date dateCreated = new Date();
			
	/**A no-arg constructor that creates a default 
	* account
	*/
	public Account() {
				
		}
			
	/**A constructor that creates an account with 
	* the specified id and initial balance
	*/
	public Account(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
		}
			
	//The accessor method for id
	public int getId() {
		return id;
	}
			
	//The accessor method for balance
	public double getBalance() {
		return balance;
		}
			
	//The accessor method for annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
		}
			
	//The mutator method for id
	public void setId(int id) {
		this.id = id;
		}
			
	//The mutator method for balance
	public void setBalance(double balance) {
		this.balance = balance;
		}
			
	//The mutator method for annual interest rate
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		}
			
	//The accessor method for dateCreated
	public DateFormat getDate() {
		return Date;
		}
			
	/**A method named getMonthlyInterestRate()
	*  that returns the monthly interest rate
	* @return
	*/
	public double getMonthlyInterestRate(){
		return (getAnnualInterestRate() / 12);
		}
			
		/**A method named withdraw that withdraws 
		* a specified amount from the account.
		*/		
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance = balance - amount;
		}
		
		else{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);	
		}
	}
	
		/**A method named deposit that deposits a 
		* specified amount to the account
		* @param amount
		*/
		public void deposit(double amount){
			balance = balance + amount;	
		}	

}
