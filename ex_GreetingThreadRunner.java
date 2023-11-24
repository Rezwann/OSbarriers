/** This program runs two threads in parallel.*/
public class ex_GreetingThreadRunner
{
   public static void main(String[] args) {
      ex_Greeting t1 = new ex_Greeting("This is the first greeting");
      ex_Greeting t2 = new ex_Greeting("This is the second greeting");
      t1.start();
      t2.start();
      new ex_Greeting("hmm").start();
   }
}