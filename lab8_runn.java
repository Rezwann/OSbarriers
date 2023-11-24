public class lab8_runn {
    public static void main(String args[]) throws InterruptedException {
        int numThreads;
        int numAdds = 10;
        Counter shared = new Counter();
        if (args.length ==0){
            System.out.println("no arguments provided");
            System.out.println("num of threads set to default 5");
            numThreads = 2;
        }
        if (args.length==1){
            System.out.println("num of threads set to " + args[0]);
            numThreads = Integer.parseInt(args[0]);
        } else {
            System.out.println("num of threads set to default 5");
            numThreads = 2;
        }

        for (int i = 1; i <= numThreads; i++) {                        
            lab8_IncreRunnable a = new lab8_IncreRunnable(numAdds, i, shared);
            Thread t1 = new Thread(a);
            t1.start();
            t1.join();
        }

        // lab8_IncreRunnable r1 = new lab8_IncreRunnable(numAdds, 1);
        // lab8_IncreRunnable r2 = new lab8_IncreRunnable(numAdds, 2);
        // new Thread(r1).start();
        // new Thread(r2).start();    
        Thread.sleep(numThreads * 5000);  	// pauses Main to make sure all threads have finished before we print the counts
								// if you increase the number of threads and/or numAdds a lot, this needs to go up too
        if (numThreads == shared.getCount()){
            System.out.println("no race conditions");
        }else {
            System.out.println("race conditions!");
        }
    }
}
