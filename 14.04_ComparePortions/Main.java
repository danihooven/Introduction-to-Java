import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Get 2 strings from user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first string: ");
    String string1 = input.next();
    System.out.print("Enter second string: ");
    String string2 = input.next();

    // Number of characters to compare
    int numOfCharacters = 0;
    if (string1.length()>string2.length())
      numOfCharacters = string1.length();
    else
      numOfCharacters = string2.length();

    // Starting index of comparison
    int startIndex = 0;

    // State whether strings are equal
    if (string1.regionMatches(true, startIndex, string2, startIndex, numOfCharacters))
      System.out.println("The strings match!");
    else
      System.out.println("The strings do not match.");


  }
}