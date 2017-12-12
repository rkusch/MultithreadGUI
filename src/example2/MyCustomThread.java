package example2;

/**
 * A custom thread that just does some long running work and then
 * reports that it's done. When extending Thread (which is a Runnable
 * because Thread implements Runnable) you suffer from the single
 * inheritance rule. (See MyCustomThread2.java for a solution)
 * 
 * @author jlombardo
 */
public class MyCustomThread extends Thread {

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
