1. Write a Java program that reverses the digits of a given integer. Use a while loop to
extract each digit and build the reversed number.

import java.util.Scanner;
public class ReverseDigits {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter an integer: ");
 int num = scanner.nextInt();
 int reversed = 0;
 while (num != 0) {
 int digit = num % 10;
 reversed = reversed * 10 + digit;
 num /= 10;
 }
 System.out.println("Reversed number: " + reversed);
 }
}

2.Create a method that checks if a given String is a palindrome (reads the same
forwards and backwards).

import java.util.Scanner;
public class PalindromeCheck {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = scanner.nextLine().toLowerCase().replaceAll("\\s+","");
 String reversed = new StringBuilder(input).reverse().toString();
 if (input.equals(reversed)) {
 System.out.println("The string is a palindrome.");
 } else {
 System.out.println("The string is not a palindrome.");
 }
 }
}


3. Write a program that counts the number of vowels and consonants in a given String.

import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a string: ");
 String input = scanner.nextLine().toLowerCase();

 int vowels = 0, consonants = 0;

 for (char c : input.toCharArray()) {
 if (c >= 'a' && c <= 'z')
 switch (c) {
 case 'a', 'e', 'i', 'o', 'u': vowels++;
 break;
 default: consonants++;
 }
 }
 System.out.println("Vowels: " + vowels);
 System.out.println("Consonants: " + consonants);
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
