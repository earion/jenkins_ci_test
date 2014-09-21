package pl.jenkins.test;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import pl.jenkins.BankAccount;

public class TestBankAccount {

	@Test
	public void shoudDebetHasSufficentFunds() {
		BankAccount account = new BankAccount(10);
		double amount = account.debit(5);
		Assert.assertEquals(5.0, amount);
		
	}
	
}