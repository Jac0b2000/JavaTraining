package Abstraction;

import java.util.Scanner;

abstract class Account {
	public abstract void deposit();
	public abstract void withdraw();
}

class AccountModel extends Account{
	Scanner s=new Scanner(System.in);
	int total;
	public void deposit() {
		int amount;
		System.out.println("enter deposit amount");
		amount=s.nextInt();
		total= total+amount;
		System.out.println("deposit amount-"+amount);
		System.out.println("total amount-"+total);
	}
	public void withdraw() {
		int amount;
		System.out.println("enter withdrawal amount");
		amount=s.nextInt();
		total=total-amount;
		System.out.println("Withdrawn amount-"+amount);
		System.out.println("total amount-"+total);
	}
}

public class AccountType {
	public static void main(String[] args) {
		AccountModel a=new AccountModel();
		a.deposit();
		a.withdraw();
	}
	
}