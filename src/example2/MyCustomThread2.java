package example2;

/**
 * A custom thread that just does some long running work and then
 * reports that it's done. Instead of extending Thread we just implement
 * Runnable. Now we can still extend a class if necessary and even implement
 * additional interfaces. No single inheritance limitation! This is the
 * preferred way to create a custom thread.
 * 
 * @author jlombardo
 */
public class MyCustomThread2 implements Runnable {

    private String s2 = "Executing";

    @Override
    public void run() {
        System.out.print(s2);
        for (long i = 0; i < 300000L; i++) {
            if (i % 3000 == 0) {
                System.out.print(".");
            }

        }
        System.out.print("Done!");
    }

}
