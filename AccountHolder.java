package com.Body;

public class AccountHolder implements KarnatakaBank {
	
	@Override
	public void withdraw()
	{
		System.out.println("Amount is Withdraw");
	}
	
	@Override
	public void deposit()
	{
		System.out.println("Amount is Deposited");
	}
	
	public static void main(String[] args)
	{
		AccountHolder AH = new AccountHolder();
		AH.deposit();
		AH.withdraw();
	}
}
