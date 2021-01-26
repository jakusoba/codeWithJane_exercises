package com.techelevator;

public class CheckingAccount extends BankAccount {
	final int overDraftFee = 10;
	//BankAccount checkingAccount = new CheckingAccount("Bernice", "CHK:1234");

	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		
	}
	@Override
	public int withdraw(int amountToWithdraw){
		int currentBalance = super.getBalance();
		int newBalance = 0;
		if(currentBalance < 0.00 && currentBalance >-100.00) {//negative balance with fee
			//newBalance = currentBalance - (amountToWithdraw + overDraftFee);
			super.withdraw(amountToWithdraw + overDraftFee);
			return super.getBalance();
		}
		if(currentBalance - (amountToWithdraw + overDraftFee) <= -100.00) {//negative balance below -100
			return currentBalance;
		}
		
		if(amountToWithdraw < currentBalance) {//positive balance
			 //currentBalance -= amountToWithdraw
			 
			return super.withdraw(amountToWithdraw);
			
			
		}	
		
			
			return newBalance; //positive balance with fee.
			
			
	}	
	
}	
	
	/**If the balance falls below $0.00 and is less than -$100.00, a $10.00 overdraft fee is also charged against the account.                                                                            |
	|         Checking account can't be overdrawn by $100.00 or more. 
	If a withdrawal request leaves the account $100 or more overdrawn, it fails and the balance remains the same.<br><br> 
	For example, if the current balance is -$89.00, and the amount to withdraw is $10.00, the resulting balance is -$99.00. 
	The withdraw is permitted since the new balance is less than -$100.00. 
	The $10.00 overdraft fee is then charged against the account, 
	resulting in a final balance of -$109.00.<br><br>A withdrawal of $11.00 in the same situation fails 
	because the new balance is -$100.00 which is equal to ***but not less than*** the limit of -$100.00. |

	#### 3. Implement the `SavingsAccount` class**/



