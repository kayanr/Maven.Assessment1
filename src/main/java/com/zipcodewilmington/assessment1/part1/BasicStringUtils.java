package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversed = new StringBuffer(str).reverse().toString();

        return reversed.substring(0,1).toUpperCase() + reversed.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] letters = str.toCharArray();
        for(int i = 0; i < letters.length; i++){
            char c = letters[i];
            if(Character.isUpperCase(c)){
                letters[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                letters[i] = Character.toUpperCase(c);
            }
        }
        return new String(letters);
    }
}
