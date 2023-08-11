package entities;

public class HolderAccount {
	
	public int accNumber;
	public String accHolder;
	public double accBalance;
	
	public void showResult() {
		System.out.println("Account Data:");
		System.out.printf("Account %d, Holder: %s, Balance: R$%.2f%n", accNumber, accHolder, accBalance);
	}
	
	public double increaseBalance(double addValue) {		
		this.accBalance += addValue;
		return accBalance;
	}
	
	public double decreaseBalance(double decreaseValue) {
		this.accBalance -= decreaseValue + 5;
		return accBalance;
	}

}
