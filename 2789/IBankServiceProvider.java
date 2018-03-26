package com.santy.provider;

import com.santy.entity.BankAccount;
import com.santy.exceptionhandler.InsufficientFundException;
import com.santy.exceptionhandler.InvalidAmountException;

/**
 * This interface provides operations to be handled by a Bank
 */
public interface IBankServiceProvider {

    BankAccount checkAccount(String accountNo);

    double getBalance(BankAccount account);

    boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException;

    boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException, InsufficientFundException;

    boolean transferMoney(BankAccount fromAccount, BankAccount toAccount) throws InsufficientFundException;

}
