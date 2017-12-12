package example3;

import java.util.List;

/**
 *
 * @author jlombardo
 */
public class MyCustomPrintThread implements Runnable {
    public static List<String> list;

    
    public MyCustomPrintThread(List<String> strList) {
        list = strList;
    }
    
    /**
     * This code is not thread safe. Two or more concurrent threads
     * could attempt to modify the list at the same time. This can result in 
     * a race condition (program freezes) where neither tread can act due to a 
     * lock on the item being accessed. Or, if not at the
     * same time, each thread will have a different idea of the list size. But
     * only one can be correct. We say the data is inconsistent.
     */
    @Override
    public void run() {
        list.remove(2);
        int length = list.size();
        System.out.println("The list size is: " + length);
    }
    
    /**
     * This version solves the problems by synchronizing access to the list.
     * This means that only one thread at a time can act on the list.
     */
//    @Override
//    public void run() {
//        synchronized(list) {
//            list.remove(2);
//            int length = list.size();
//            System.out.println("The list size is: " + length);
//        }
//    }
    
}
