import java.util.Arrays;        // Arrays class ko import karna jo arrays ke sath kaam aata hai
import java.util.stream.Stream; // Stream class ko import karna jo stream operations ke liye hota hai
import java.util.*;             // Java util package ke sabhi classes ko import karna
import java.util.stream.*;      // Stream package ke sabhi classes ko import karna

public class MoreOnStreamSolution3 { // 'hey' naam ka ek public class define karna

    public static void main(String[] args) { // Main method jahan se program execution shuru hota hai

        // List<Integer> banate hain Arrays.asList() method ka use karke
        List<Integer> list = Arrays.asList(12, 45, 63, 52, 21);

        // Stream operations ko individual variables ke sath perform karna

        // List se ek Stream banana
        Stream<Integer> StreamData = list.stream();

        // Stream ko filter karna sirf even numbers ke liye
        Stream<Integer> FilterData = StreamData.filter(n -> n % 2 == 0);

        // Filtered stream ko sort karna. Isse ek new sorted stream banega
        Stream<Integer> SortedStream = FilterData.sorted();

        // Sorted stream ke har element ko 2 se multiply karna
        Stream<Integer> MapStream = SortedStream.map(n -> n * 2);

        // Mapped stream ke har element ko print karna
        MapStream.forEach(n -> System.out.println(n));

        // Upar ke code ko comment karte hain aur method chaining ka use karke same result achieve karte hain
        System.out.println("Method chaining ka use karte hue:");

        // Method chaining ka use karke stream operations ko ek concise tareeke se perform karna
        list.stream() // List se stream banana
            .filter(n -> n % 2 == 0) // Even numbers ko filter karna
            .sorted() // Filtered numbers ko sort karna
            .map(n -> n * 2) // Har number ko double karna
            .forEach(n -> System.out.println(n)); // Har resulting number ko print karna
    }
}
