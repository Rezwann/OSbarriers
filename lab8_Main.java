public class lab8_Main {

    /**
     * This program should create a number of Incrementer threads
     * at the same time.  All Incrementer threads should be modifying the same
     * shared Counter object. Because they are all running at the
     * same time, we should see some thread interference (race conditions) 
     * as they try to modify the same Counter.
     **/
    public static void main(String args[]) throws InterruptedException {
        
        int numAdds = 200;
        
        new lab8_Incrementer(numAdds, 1).start();
        new lab8_Incrementer(numAdds, 2).start();
        
        Thread.sleep(1000);  	// pauses Main to make sure all threads have finished before we print the counts
								// if you increase the number of threads and/or numAdds a lot, this needs to go up too
        System.out.println("Nothing useful for now");
    }
}

