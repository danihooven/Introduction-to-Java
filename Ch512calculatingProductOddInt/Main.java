/* ------------------------------------------------
(Calculating the Product of Odd Integers) Write an application that calculates the product of the odd integers from 1 to 15.
------------------------------------------------ */

class Main {
  public static void main(String[] args) {
    int result = 0;
    for (int counter = 1; counter<=15; counter+=2){
      result += counter;
    }
    System.out.println(+result);
    }
  }