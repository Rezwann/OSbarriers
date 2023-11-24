import java.util.Date;

/**A Thread that repeatedly prints a greeting.*/

public class ex_Greeting extends Thread {
   public ex_Greeting(String aGreeting)
   {
      greeting = aGreeting;
   }

   public void run()
   {
      try
      {
         for (int i = 1; i <= REPETITIONS; i++)
         {
            Date now = new Date();
            System.out.println(now + " " + greeting);
            Thread.sleep(DELAY);         
         }
      }
      catch (InterruptedException exception)
      {
      }
   }

   private String greeting;
   private static final int REPETITIONS = 50;
   private static final int DELAY = 1000;
}
