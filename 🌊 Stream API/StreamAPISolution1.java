import java.util.Arrays;
import java.util.List;
import java.util.stream.*;;

public class StreamAPISolution1 {
    public static void main(String[] args) {
        
        /* Java ke andar Stream API ko data ke upar operation karne ke liye introduce kiya gya hai
         * ye java 8 me introduced huaa hai (java Version 1.8)
         * 
         * 
         */
        // consider some data

        List<Integer> l1 = Arrays.asList(23, 33, 45, 67, 89);
        // Ab aap yahaan par Stream API ke operations ko l1 par apply kar sakte hain

        Stream<Integer> streamdata= l1.stream();

        streamdata.forEach(i->System.out.println(i));// ye ek bar hi use ho sakta hai dobara se use nahi hoga 







         
    }
}
