import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class MoreOnStreamSolution2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 34, 56, 78, 90);
        /*
         * yaha par maine ek stream banaya hai jisko sorted kiya jaise hi sort kiya wo
         * ek new Stream ban gya
         * aur mai us new stream ke upar operation kiya hu usko print kiya hu
         */

        Stream<Integer> streamdata = list.stream();
        Stream<Integer> sorteddata = streamdata.sorted();
        sorteddata.forEach(i -> System.out.println(i));

    }
}
