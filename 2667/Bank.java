package com.htc.financials;

import java.util.Arrays;

import com.htc.financials.exceptions.InsufficientFundException;
import com.htc.financials.exceptions.InvalidAmountException;

/**
 * Bank class which has a relationship with BankAccount class
 */
public class Bank implements IBankServiceProvider {
	private BankAccount[] bankAccounts = new BankAccount[] {};
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
	 * Get Bank Accounts
	 *
	 * @return
	 */
	public BankAccount[] getBankAccounts() {
		return bankAccounts;
	}

	/**
	 * verify if the account exists
	 *
	 * @param accountNo
	 * @return
	 */
	@Override
	public BankAccount verifyAccount(String accountNo) {
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
		if (verifyAccount(account.getAccountNo()) != null) {
			return account.getBalance();
		}
		return 0.00;
	}

	/**
	 * Deposit Money to the account
	 *
	 * @param account
	 * @param amount
	 * @return boolean
	 * @throws InvalidAmountException
	 */
	@Override
	public boolean depositMoney(BankAccount account, double amount) throws InvalidAmountException {
		boolean isDepositAmount = false;
		if (amount <= 0.00) {
			throw new InvalidAmountException("Deposit amount should be greater than zero.");
		}
		if (verifyAccount(account.getAccountNo()) != null) {
			account.setBalance(account.getBalance() + amount);
			isDepositAmount = true;
		}
		return isDepositAmount;
	}

	/**
	 * Withdraw money from the account
	 *
	 * @param account
	 * @param amount
	 * @return boolean
	 * @throws InvalidAmountException
	 * @throws InsufficientFundException
	 */
	@Override
	public boolean withdrawMoney(BankAccount account, double amount)
			throws InvalidAmountException, InsufficientFundException {
		boolean isWithdrawAmount = false;
		if (amount <= 0.00) {
			throw new InvalidAmountException("Withdrawal amount should be greater than zero.");
		}
		if (verifyAccount(account.getAccountNo()) != null) {
			if (account.getBalance() < amount)
				throw new InsufficientFundException("Insufficient amount to withdraw.");
			account.setBalance(account.getBalance() - amount);
			isWithdrawAmount = true;
		}
		return isWithdrawAmount;
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
		boolean isTransferAmount = false;
		if ((verifyAccount(fromAccount.getAccountNo()) != null) && (verifyAccount(toAccount.getAccountNo()) != null)) {
			sourceBalance = fromAccount.getBalance();
			if (sourceBalance <= 0.00) {
				throw new InsufficientFundException("Insufficient balance to transfer.");
			}
			toAccount.setBalance(toAccount.getBalance() + sourceBalance);
			fromAccount.setBalance(fromAccount.getBalance() - sourceBalance);
			isTransferAmount = true;
		}
		return isTransferAmount;
	}

	public static void main(String[] args) throws InvalidAmountException, InsufficientFundException {
		Bank bank = new Bank();
		BankAccount bankAccount1 = bank.createAccount("Arun");
		BankAccount bankAccount2 = bank.createAccount("Raj");
		System.out.println();
		System.out.println("========New Accounts=======");
		System.out.println(Arrays.toString(bank.getBankAccounts()));
		// bank.de
		bank.depositMoney(bankAccount1, 2000.00);
		System.out.println();
		System.out.println("========After Deposit=======");
		System.out.println(Arrays.toString(bank.getBankAccounts()));

		System.out.println();
		System.out.println("=========After Transfer=========");
		bank.transferMoney(bankAccount1, bankAccount2);
		System.out.println(Arrays.toString(bank.getBankAccounts()));
		System.out.println();
		System.out.println("==========After Withdrawal========");
		bank.withdrawMoney(bankAccount2, 700.00);
		System.out.println(Arrays.toString(bank.getBankAccounts()));
	}

}
