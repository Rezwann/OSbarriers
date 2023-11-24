public class ex_Runn {

    public void run() {
        System.out.println("Hello from a thread!");
    }
    public static void main (String[] args){
    ex_GreetingRunnable r1 = new ex_GreetingRunnable("Hi");
    ex_GreetingRunnable r2 = new ex_GreetingRunnable("Hello");
    new Thread(r1).start();
    new Thread(r2).start();
    }    
}
