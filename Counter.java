public class Counter {
    private int count = 0;

    public void increase(String name){
        int currCount = count; // read
        // introduce a delay between read and write to "encourage" race conditions
        System.out.println("");
        count = currCount + 1; // write
    }
    
    public int getCount() {
        return count;
      }
}

