package com.santy.impl;

import java.util.Scanner;

/**
 * String manipulation class
 */
public class StringServiceProviderNonStatic {

    /**
     * Reverse given string
     * @param stringToReverse
     * @return
     */
    public String reverseString(String stringToReverse){
        return new StringBuilder(stringToReverse).reverse().toString();
    }

    /**
     * Find and replace string
     * @param stringToBeSearched
     * @param stringToReplace
     * @return
     */
    public String replaceString(String inputString, String stringToBeSearched, String stringToReplace){

        return inputString.replaceAll(stringToBeSearched,stringToReplace);
    }

    /**
     * Find if string is present
     * @param stringToBeSearched
     * @param stringToFind
     * @return
     */
    public boolean findString(String stringToBeSearched, String stringToFind){
        return stringToBeSearched.contains(stringToFind);
    }

    public static void main(String[] args){
        StringServiceProviderNonStatic stringServiceProvider = new StringServiceProviderNonStatic();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        System.out.println(stringServiceProvider.reverseString(sc.nextLine()));
        System.out.print("Enter input string: ");
        String inputString = sc.nextLine();
        System.out.println("Enter string to search: ");
        String stringToSearch = sc.nextLine();
        System.out.println("Enter string to replace: ");
        String stringToReplace = sc.nextLine();
        System.out.println(stringServiceProvider.replaceString(inputString,stringToSearch,stringToReplace));
        System.out.print("Enter string to search: ");
        stringToSearch = sc.nextLine();
        System.out.print("Enter string to find: ");
        String stringToFind = sc.nextLine();
        System.out.println((stringServiceProvider.findString(stringToSearch,stringToFind)==true)?"String Found":"Strng not found");
    }
}
