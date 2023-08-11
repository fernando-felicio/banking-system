package application;

import java.util.Scanner;

import java.util.Locale;

import entities.HolderAccount;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		HolderAccount holder = new HolderAccount();
		
		System.out.println("Enter account number:");
		holder.accNumber = sc.nextInt();
		
		System.out.println("Enter account holder:");
		holder.accHolder = sc.nextLine();
		
		//Consumindo a próxima linha para evitar o crash
		sc.nextLine();
		
		System.out.println("Is there an initial deposit? (y/n)");
		String initialDeposit = sc.nextLine();
		
		sc.close();
		
	}

}
