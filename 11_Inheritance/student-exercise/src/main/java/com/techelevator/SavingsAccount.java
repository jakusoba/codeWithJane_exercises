package com.techelevator;



public class SavingsAccount extends BankAccount {
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
		
	}
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
		
	}
		@Override
	public int withdraw(int amountToWithdraw) {
			int currentBalance = super.getBalance();
			if(amountToWithdraw > currentBalance) {
				return super.getBalance();
			}
			
			if((currentBalance - amountToWithdraw) < 150) {
				super.withdraw( amountToWithdraw + 2);
				return super.getBalance();
			}
			
			super.withdraw(amountToWithdraw);
			return super.getBalance();
			
		
		
	}	
	//If the current balance is less than $150 when a withdrawal is made, 
	//an additional $2 service charge is withdrawn from the account.       |
	//If a withdrawal is requested for more than the current balance, the withdrawal fails and the balance remains the same. No fees are incurred. |

	/*Method withdraw = savingsAccount.getClass().getMethod("withdraw", int.class);
    Method getBalance = savingsAccount.getClass().getMethod("getBalance");
    int newBalance = (int) withdraw.invoke(savingsAccount, 1);
    assertEquals(-1, newBalance);
    assertEquals(-1, getBalance.invoke(savingsAccount));**/
}



