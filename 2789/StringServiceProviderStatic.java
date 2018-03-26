package com.santy.impl;

import java.util.Scanner;

/**
 * String manipulation class
 */
public class StringServiceProviderStatic {

    /**
     * Reverse given string
     * @param stringToReverse
     * @return
     */
    public static String reverseString(String stringToReverse){
        return new StringBuilder(stringToReverse).reverse().toString();
    }

    /**
     * Find and replace string
     * @param stringToBeSearched
     * @param stringToReplace
     * @return
     */
    public static String replaceString(String inputString, String stringToBeSearched, String stringToReplace){

        return inputString.replaceAll(stringToBeSearched,stringToReplace);
    }

    /**
     * Find if string is present
     * @param stringToBeSearched
     * @param stringToFind
     * @return
     */
    public static boolean findString(String stringToBeSearched, String stringToFind){
        return stringToBeSearched.contains(stringToFind);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse: ");
        System.out.println(StringServiceProviderStatic.reverseString(sc.nextLine()));
        System.out.print("Enter input string: ");
        String inputString = sc.nextLine();
        System.out.println("Enter string to search: ");
        String stringToSearch = sc.nextLine();
        System.out.println("Enter string to replace: ");
        String stringToReplace = sc.nextLine();
        System.out.println(StringServiceProviderStatic.replaceString(inputString,stringToSearch,stringToReplace));
        System.out.print("Enter string to search: ");
        stringToSearch = sc.nextLine();
        System.out.print("Enter string to find: ");
        String stringToFind = sc.nextLine();
        System.out.println((StringServiceProviderStatic.findString(stringToSearch,stringToFind)==true)?"String Found":"Strng not found");
    }
}
