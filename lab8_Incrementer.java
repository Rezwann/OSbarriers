public class lab8_Incrementer extends Thread {

    private int numIncrements;
    private String name;

    public lab8_Incrementer(int numIncrements, int index) {
        this.name = "Thread " + index;
        this.numIncrements = numIncrements;
    }

    public void run() {
        // Does nothing useful for now
        // Make it increase the common counter 
        for (int i = 0; i < numIncrements; i++) {
            System.out.println(this.name + " " + i);
        }
    }
}
