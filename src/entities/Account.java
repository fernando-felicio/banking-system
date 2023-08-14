package entities;

public class Account {
	
	private int accNumber;
	private String accHolder;
	private double accBalance;
	
	public Account (int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}
	
	public Account (int accNumber, String accHolder, double initialDeposit) {
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

	
	public void deposit (double addValue) {
		accBalance += addValue;
	}
	
	public void withdraw (double decreaseValue) {
		accBalance -= decreaseValue + 5.00;
	}
	
	public String toString() {
		return "Account "
				+ accNumber
				+ ", Holder: "
				+ accHolder
				+ ", Balance: R$"
				+ String.format("%.2f", accBalance);
		
	}
	
	
}
