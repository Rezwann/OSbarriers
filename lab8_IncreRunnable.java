public class lab8_IncreRunnable implements Runnable {
    private int numIncrements;
    private String name;
    private int tot;
    public lab8_IncreRunnable(int numIncrements, int index, Counter ca) {
        this.name = "Thread " + index;
        this.numIncrements = numIncrements;
        ca.increase(name);
        tot = ca.getCount();
    }

    public void run() {
        // Make it increase the common counter 
        for (int i = 0; i <= numIncrements; i++) {
            System.out.println(this.name + " " + tot);
    }
    }
}