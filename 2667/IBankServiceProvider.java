package com.htc.financials;

import com.htc.financials.exceptions.InsufficientFundException;
import com.htc.financials.exceptions.InvalidAmountException;

/**
 * This interface provides bank functionalities
 */
public interface IBankServiceProvider {

	BankAccount verifyAccount(String accountNo);

	double getBalance(BankAccount account);

	boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;

	boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException, InsufficientFundException;

	boolean transferMoney(BankAccount fromAccount, BankAccount toAccount) throws InsufficientFundException;

}