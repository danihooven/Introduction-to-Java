class Main {
  public static void main(String[] args) throws Throwable {
    try {
          someMethod2();
        } catch(Exception e) {
          System.out.println("Caught in main");
        }  
  }

  public static void someMethod() throws Exception {
      System.out.println("The Exception in someMethod() method");
      throw new Exception("thrown from someMethod() method");
   }
   public static void someMethod2() throws Throwable {
      try {
         someMethod();
      } catch(Exception e) {
         System.out.println("Inside someMethod2() method");
         throw e;
      }
   }
}