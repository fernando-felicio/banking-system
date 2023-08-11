package entities;

public class HolderAccount {
	
	public int accNumber;
	public String accHolder;
	public double accBalance;
	
	public void showResult() {
		System.out.println("Account Data:");
		System.out.printf("Account %d, Holder: %s, Balance: R$%.2f", accNumber, accHolder, accBalance);
	}
	
	

}
