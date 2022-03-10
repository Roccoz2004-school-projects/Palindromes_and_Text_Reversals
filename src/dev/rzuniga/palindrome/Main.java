package dev.rzuniga.palindrome;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        queryPalindrome("mdfam");
    }
    public static boolean queryPalindrome(String str) {
        boolean isPalindrome = false;
        StringBuilder output = new StringBuilder();
        output.append(str);
        output.reverse();
        if (String.valueOf(output).equals(str)) {
            isPalindrome = true;
            System.out.println(isPalindrome);
        } else {
            System.out.println(isPalindrome);
        }
        return isPalindrome;
    }
}
