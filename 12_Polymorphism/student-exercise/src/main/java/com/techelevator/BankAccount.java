package com.techelevator;

public class BankAccount implements Accountable {

    private String accountHolderName;
    private String accountNumber;
    private int balance;
    private int transferAmount;

    public BankAccount(String accountNumber, int balance ) {
       
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }


    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.accountHolderName = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    //BankAccount BA1 = new BankAccount("Jason", "123", 0);
    //BankAccount BA2 = new BankAccount("May", "143", 0);

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // Update the balance by using the DollarAmount.Plus method
    public int deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    // Update the balance by using the DollarAmount.Minus method
    public int withdraw(int amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;
    }
    
    public int transferTo(BankAccount destinationAccount, int transferAmount) {
    	if(transferAmount <= this.balance)
    		this.balance -= transferAmount;
    	
     destinationAccount.deposit(transferAmount);
		
	return 0;
	}
    
   /** public void transferTests() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor constructor = SafeReflection.getConstructor(account,String.class, String.class, int.class);
        BankAccount source = (BankAccount) constructor.newInstance("","",50);
        BankAccount destination = (BankAccount) constructor.newInstance("","",0);

        Method transferTo = source.getClass().getMethod("transferTo", BankAccount.class, int.class);
        int newSourceBalance = (int) transferTo.invoke(source,destination,24);

        assertEquals(26, newSourceBalance);
        assertEquals(24, destination.getBalance());
        assertEquals(26, source.getBalance());**/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
