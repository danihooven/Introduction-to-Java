/* ------------------------------------------------- 6.14 (Exponentiation) Write a method integerPower(base, exponent) that returns the value of base exponent 

For example, integerPower(3, 4) calculates 3 4 (or 3 * 3 * 3 * 3 ). Assume that exponent is a positive, nonzero integer and that base is an integer. Use a for or while statement to control the calculation. Do not use any Math class methods. Incorporate this method into an application that reads integer values for base and exponent and performs the calculation with the integerPower method.
-------------------------------------------------- */

class Main {
  public static void main(String[] args) {
    System.out.println(Exponentiation.integerPower(4, 6));
    System.out.println(Exponentiation.integerPower(6, 8));
  }
}

class Exponentiation{
  public static int integerPower(int base, int exponent){
    int result = 1;
    for(int x = 1; x <= exponent; x++){
      result = (result*base);
    }
    return result;
  }
}