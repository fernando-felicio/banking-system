package entities;

public class HolderAccount {
	
	private int accNumber;
	private String accHolder;
	private double accBalance;
	
	public HolderAccount (int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}
	
	public HolderAccount (int accNumber, String accHolder, double initialDeposit) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(initialDeposit);
	}
	
		
	public int getAccNumber() {
		return accNumber;
	}


	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public double getAccBalance() {
		return accBalance;
	}


	public void showResult() {
		System.out.println("Account Data:");
		System.out.printf("Account %d, Holder: %s, Balance: R$%.2f%n", accNumber, accHolder, accBalance);
	}
	
	public void deposit (double addValue) {
		accBalance += addValue;
	}
	
	public void withdraw (double decreaseValue) {
		accBalance -= decreaseValue + 5.00;
	}
	
	
}
