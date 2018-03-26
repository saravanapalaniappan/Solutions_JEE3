package com.htc.financials;

import java.io.Serializable;

public class BankAccount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accountNo;
	private String accountName;
	private double balance = 1000.00;

	/**
	 * Initialize Bank Account with parameterized constructor
	 *
	 * @param accountNo
	 * @param accountName
	 */
	public BankAccount(String accountNo, String accountName) {
		this.accountNo = accountNo;
		this.accountName = accountName;
	}

	/**
	 * Get Account Number
	 *
	 * @return
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * Set Account Number
	 *
	 * @return
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * Get Account Holder Name
	 *
	 * @return
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * Set Account holder name
	 *
	 * @param accountName
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * Get account balance
	 *
	 * @return
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Set Account balance
	 *
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account Detail{" + "Account Number='" + accountNo + '\'' + ", Account Holder Name='" + accountName
				+ '\'' + ", Current Balance=" + balance + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		BankAccount bankAccount = (BankAccount) o;

		if (Double.compare(bankAccount.balance, balance) != 0)
			return false;
		if (!accountNo.equals(bankAccount.accountNo))
			return false;
		return accountName.equals(bankAccount.accountName);

	}

	@Override
	public int hashCode() {
		int result = accountNo.hashCode();
		result = 31 * result + accountName.hashCode();
		return result;
	}
}