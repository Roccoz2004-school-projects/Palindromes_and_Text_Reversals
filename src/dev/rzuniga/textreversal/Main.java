package dev.rzuniga.textreversal;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
	    System.out.println(reverseString("STRING INPUT"));
    }
    public static String reverseString(String str) {
        StringBuilder output = new StringBuilder();
        output.append(str);
        output.reverse();
        return String.valueOf(output);
    }
}
