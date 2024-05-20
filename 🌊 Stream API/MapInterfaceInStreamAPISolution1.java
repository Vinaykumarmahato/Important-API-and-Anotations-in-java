import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
public class MapInterfaceInStreamAPISolution1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 34, 56, 78, 90);
        Stream<Integer> streamdata = list.stream();
        
        Stream<Integer> sortedStream = streamdata.sorted();
        Stream<Integer> MapStream = sortedStream.map(n->n*2);

        MapStream.forEach(n->System.out.println(n));
        
        

    }
}
