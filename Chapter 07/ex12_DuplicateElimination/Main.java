import java.util.Scanner;

public class Main{
  public static void main(String[] args) {

    int[] array = new int[5];
    int L = array.length;
    Scanner input = new Scanner(System.in);

    for(int i=0; i<L; i++){
      System.out.println("Enter a number between 10 and 100: ");
      array[i] = input.nextInt();
    }
    input.close();


    System.out.println("Given array is: ");
    for(int i=0; i<L; i++)
    System.out.print(array[i] +" ");
    System.out.println();

    for(int i=0; i<L-1; i++){
      for(int j=i+1; j<L; j++){
        if(array[i] == array[j]){
          array[j]=array[L-1];
          L--;
        }//end if statement comparison
      } //end for loop j
    } //end for loop i

    System.out.println("New array without duplicates is: ");
    for(int i=0; i<L; i++)
    System.out.print(array[i] +" ");



  } // end method Main
} // end class DupElim

/* (Duplicate Elimination) Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number is read, display it only if it’s not a duplicate of a number already read. Provide for the worst case, in which all five numbers are different. Use the smallest possible array to solve this problem. Display the complete set of unique values input after the user enters each new value. */
