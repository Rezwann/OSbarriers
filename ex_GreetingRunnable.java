import java.util.Date;

public class ex_GreetingRunnable implements Runnable {

    public ex_GreetingRunnable(String aGreeting)
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
