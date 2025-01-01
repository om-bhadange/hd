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

  
import java.io.*;
public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        String s = "level";
        boolean res = isPalindrome(s);
        if (res) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }
    }
}


3. Write a program that counts the number of vowels and consonants in a given String.

public class CountVowelConsonant {    
    public static void main(String[] args) {    
        int vCount = 0, cCount = 0;    
        String str = "This is a really simple sentence";     
        str = str.toLowerCase();    
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                vCount++;    
            }    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
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
