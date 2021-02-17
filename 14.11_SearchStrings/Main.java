class Main {
  public static void main(String[] args) {
    // input line of text
    String string1 = "greedy goats gobbled up gooseberries, getting good at grabbing the goodies";

    // number of char occurances using indexOf
    int i = string1.indexOf('g');
    int numOfOccurences = 0;
    while (i != -1){
      numOfOccurences++;
      i = string1.indexOf('g',i+1);
    }

    System.out.println("The letter 'g' occurs in the line ");
    System.out.println(string1);
    System.out.println(+numOfOccurences +" times.");
    

  }
}