package com.htc.financials;

import java.util.Scanner;

public class StringServiceProvider {
	/**
	 * Reverse given string
	 * 
	 * @param stringToReverse
	 * @return
	 */
	public String reverseString(String stringToReverse) {
		return new StringBuilder(stringToReverse).reverse().toString();
	}

	/**
	 * Find and replace string
	 * 
	 * @param stringToBeSearched
	 * @param stringToReplace
	 * @return
	 */
	public String replaceString(String inputString, String stringToBeSearched, String stringToReplace) {

		return inputString.replaceAll(stringToBeSearched, stringToReplace);
	}

	/**
	 * Find if string is present
	 * 
	 * @param stringToBeSearched
	 * @param stringToFind
	 * @return
	 */
	public boolean findString(String stringToBeSearched, String stringToFind) {
		return stringToBeSearched.contains(stringToFind);
	}

	public static void main(String[] args) {
		StringServiceProvider stringServiceProvider = new StringServiceProvider();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter string to reverse: ");
		System.out.println(stringServiceProvider.reverseString(scanner.nextLine()));
		System.out.print("Enter input string: ");
		String inputString = scanner.nextLine();
		System.out.println("Enter string to search: ");
		String stringToSearch = scanner.nextLine();
		System.out.println("Enter string to replace: ");
		String stringToReplace = scanner.nextLine();
		System.out.println(stringServiceProvider.replaceString(inputString, stringToSearch, stringToReplace));
		System.out.print("Enter string to search: ");
		stringToSearch = scanner.nextLine();
		System.out.print("Enter string to find: ");
		String stringToFind = scanner.nextLine();
		System.out.println((stringServiceProvider.findString(stringToSearch, stringToFind) == true) ? "String Found"
				: "Strng not found");
	}
}
