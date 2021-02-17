public class Main
{
	public static void main( String args[] )
	{

  Time2 time = new Time2(22, 58, 58);

  System.out.println("Time: ");
  System.out.printf(" %s\n", time.toUniversalString());
  System.out.printf(" %s\n", time.toString());

  time.tick();
  System.out.println("add 1 second");
  System.out.printf(" %s\n", time.toString());

  time.incrementMinute();
  System.out.println("add 1 minute");
  System.out.printf(" %s\n", time.toString());

  time.incrementHour();
  System.out.println("add 1 hour");
  System.out.printf(" %s\n", time.toString());

  for (int i = 0; i <= 1; i++)
    time.tick();
  
  System.out.println("into the next day");
  System.out.printf(" %s\n", time.toString());
		
	}//end method main
}//end class
