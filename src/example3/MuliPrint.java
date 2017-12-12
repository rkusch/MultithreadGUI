package example3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author jlombardo
 */
public class MuliPrint {
    
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("one");
        strList.add("two");
        strList.add("three");
        
        // Thread #1
        int length = strList.size();
        System.out.println("Length of list is: " + length);
        
        // Thread #2
        final Executor executor = Executors.newFixedThreadPool(1);
        MyCustomPrintThread t2 = new MyCustomPrintThread(strList);
        executor.execute(t2);
    }
}
