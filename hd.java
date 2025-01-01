1. Write a Java program that reverses the digits of a given integer. Use a while loop to
extract each digit and build the reversed number.

  class Main {
  public static void main(String[] args) {
    
    int num = 1234567, reversed = 0;

    for(;num != 0; num /= 10) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}

2.Create a method that checks if a given String is a palindrome (reads the same
forwards and backwards).


public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        
        return cleanStr.equals(reversedStr);
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello")); // false
    }
}

3. Write a program that counts the number of vowels and consonants in a given String.

public class StringAnalyzer {
    public static void countVowelsAndConsonants(String str) {
        if (str == null) {
            System.out.println("The input string is empty.");
            return;
        }
        
        int vowels = 0;
        int consonants = 0;
        
        str = str.toLowerCase();
        
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    
    public static void main(String[] args) {
        countVowelsAndConsonants("Hello World!");
        countVowelsAndConsonants("Java Programming");
    }
}

4. Implement a method that capitalizes the first letter of each word in a given String.

class Main {
  public static void main(String[] args) {

    String name = "programiz";

    String firstLetter = name.substring(0, 1);
    String remainingLetters = name.substring(1, name.length());

    firstLetter = firstLetter.toUpperCase();
    name = firstLetter + remainingLetters;
    System.out.println("Name: " + name);

  }
}



5. Write a program that checks if a given number is even or odd (from original list).

import java.io.*;
import java.util.Scanner;
class GFG {
    public static void main(String[] args)
    {
        int num = 10;
        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
    }
}
