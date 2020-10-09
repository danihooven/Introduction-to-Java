/* -------------------------------------------
(Modified Compound-Interest Program) 
Modify the compound-interest application of Fig. 5.6 
to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. 
Use a for loop to vary the interest rate.
-------------------------------------------- */

class Main {
  public static void main(String[] args) {
    double amount;              // amount on deposit at end of each year
    double principal = 1000.0;  // initial amount before interest
    double rate = 0.05;         // interest rate

    // increase rate by 1%
    for (rate = 0.05; rate <= 0.10; rate+=.01){

      // display headers
      System.out.printf("%s%20s%20s%n", "Year", "Amount on deposit", "Interest Rate");
      
      // calculate amouunt on deposit for each of ten years
      for (int year = 1; year <= 10; ++year){
        
        // calculate new amount for specified year
        amount = principal * Math.pow(1.0 + rate, year);

        // display the year and the amount
        System.out.printf("%4d%, 20.2f%, 20.2f%%%n", year, amount, rate);
      }
    }
  }
}