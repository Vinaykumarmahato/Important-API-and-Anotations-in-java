import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class MoreOnStreamSolution1 {
    
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(12,34,56,78,90);


        Stream<Integer>streamdata=list.stream();

        


        // long count=streamdata.count();
        // System.out.println(count);
        
        /* yaha par ye stream ek bar use ho gya hai ab hmlog esko aage use nahi kar sakte hai bhai */

        // streamdata.forEach(i->System.out.println(i)); 
        // ye pahle hi use ho gya hai es liye ab eska use nahi kar sakte hai log.



    
        

    }
}
