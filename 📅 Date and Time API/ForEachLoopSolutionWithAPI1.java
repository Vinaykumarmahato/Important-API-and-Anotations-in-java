import java.util.*;
import java.util.function.Consumer;

public class ForEachLoopSolutionWithAPI1 {
    
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        al1.add(2);
        al1.add(4);
        al1.add(5);
        al1.add(8);
        al1.add(9);

        System.out.println(al1);

        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 0);

        // Consumer<integer> cons= i-> System.err.println(i);
           
        list2.forEach(i->System.out.println(i));

        // for(Integer i:list2){
        //     System.out.println(i);
        // }

        /* Agara hm chahte hai internally array ke value ko access karna with inbuilt method then we 
         * can use there for each loop
         * 
         * where we need to call consumer interface.
         * 
         */
        
        // If you want to print list2, you can add:
        // System.out.println(list2);
    }
}
