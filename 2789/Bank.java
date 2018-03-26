package com.santy.impl;

import com.santy.entity.BankAccount;
import com.santy.exceptionhandler.InsufficientFundException;
import com.santy.exceptionhandler.InvalidAmountException;
import com.santy.provider.IBankServiceProvider;

import java.util.Arrays;

/**
 * Bank class which has a relationship with BankAccount class
 */
public class Bank implements IBankServiceProvider {
    private BankAccount[] bankAccounts = new BankAccount[]{};
    private static int lastAssignedNo = 0;

    /**
     * Initialize Bank class
     */
    public Bank() {

    }

    /**
     * Creates Bank account
     *
     * @param accountName
     */
    public BankAccount createAccount(String accountName) {
        lastAssignedNo = lastAssignedNo + 1;
        BankAccount account = new BankAccount(String.valueOf(lastAssignedNo), accountName);
        this.bankAccounts = Arrays.<BankAccount>copyOf(this.bankAccounts, this.bankAccounts.length + 1);
        this.bankAccounts[this.bankAccounts.length - 1] = account;
        return account;
    }

    /**
     * Get Bank Accocunts
     *
     * @return
     */
    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    /**
     * Check if the account exists
     *
     * @param accountNo
     * @return
     */
    @Override
    public BankAccount checkAccount(String accountNo) {
        for (BankAccount account : this.bankAccounts) {
            if (account.getAccountNo().equals(accountNo))
                return account;
        }
        return null;
    }

    /**
     * Get the account balance
     *
     * @param account
     * @return
     */
    @Override
    public double getBalance(BankAccount account) {
        if (checkAccount(account.getAccountNo()) != null) {
            return account.getBalance();
        }
        return 0.00;
    }

    /**
     * Deposit Money to the account
     *
     * @param account
     * @param amount
     * @return
     * @throws InvalidAmountException
     */
    @Override
    public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
        if (amount <= 0.00) {
            throw new InvalidAmountException("Deposit amount can not be less than or equal to zero.");
        }
        if (checkAccount(account.getAccountNo()) != null) {
            account.setBalance(account.getBalance() + amount);
            return true;
        }
        return false;
    }

    /**
     * Withdraw money from the account
     *
     * @param account
     * @param amount
     * @return
     * @throws InvalidAmountException
     * @throws InsufficientFundException
     */
    @Override
    public boolean withdrawMoney(BankAccount account, double amount) throws InvalidAmountException, InsufficientFundException {
        if (amount <= 0.00) {
            throw new InvalidAmountException("Withdrawal amount can not be less than or zero.");
        }
        if (checkAccount(account.getAccountNo()) != null) {
            if (account.getBalance() < amount)
                throw new InsufficientFundException("Insufficient fund to withdraw.");
            account.setBalance(account.getBalance() - amount);
            return true;
        }
        return false;
    }

    /**
     * Transfer fund to external account
     *
     * @param fromAccount
     * @param toAccount
     * @return
     * @throws InsufficientFundException
     */
    @Override
    public boolean transferMoney(BankAccount fromAccount, BankAccount toAccount) throws InsufficientFundException {
        double sourceBalance;
        if ((checkAccount(fromAccount.getAccountNo()) != null) && (checkAccount(toAccount.getAccountNo()) != null)) {
            sourceBalance = fromAccount.getBalance();
            if (sourceBalance <= 0.00) {
                throw new InsufficientFundException("Insufficient balance to transfer.");
            }
            toAccount.setBalance(toAccount.getBalance() + sourceBalance);
            fromAccount.setBalance(fromAccount.getBalance() - sourceBalance);
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws InvalidAmountException, InsufficientFundException {
        Bank bank = new Bank();
        BankAccount account1 = bank.createAccount("John");
        BankAccount account2 = bank.createAccount("David");
        System.out.println("****************New Accounts*************");
        System.out.println(Arrays.toString(bank.getBankAccounts()));
        //bank.de
        bank.depositMoney(account1, 1000.00);
        System.out.println("****************After Deposit*************");
        System.out.println(Arrays.toString(bank.getBankAccounts()));


        System.out.println("****************After Transfer*************");
        bank.transferMoney(account1, account2);
        System.out.println(Arrays.toString(bank.getBankAccounts()));

        System.out.println("****************After Withdrawal*************");
        bank.withdrawMoney(account2, 500.00);
        System.out.println(Arrays.toString(bank.getBankAccounts()));
    }

}