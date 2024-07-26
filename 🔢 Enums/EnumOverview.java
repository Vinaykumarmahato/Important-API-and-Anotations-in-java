/**
 * Jab hume ek set of values chahiye jo constant rahenge, tab hum Enum concept ka use kar sakte hain.
 * 
 
 * Enum ko class ke andar bhi likh sakte hain aur class ke bahar bhi likh sakte hain.
 * 
 * Enum ka object nahi bana sakte hain.
 * 
 * Hum index value ko ordinal method se paa sakte hain.
 * Agar hume sabhi constant values print karni hain, to hum .values method ka use kar sakte hain, jo ek array return karta hai.
 */

// Enum Week banaya gaya hai jisme week ke days constant values ke roop me define kiye gaye hain
enum Week {
    Mon, TUE, WED, THR, FRI, SAT, SUN;
}

public class EnumOverview { // EnumOverview naam ka public class define kiya gaya hai

    public static void main(String[] args) { // Main method jahan se program execution shuru hota hai

        // Week enum ka ek instance w banaya gaya jo Mon ko refer karta hai
        Week w = Week.Mon;
        System.out.println(w); // w ko print karna (output: Mon)

        // Enum value ka index (ordinal) nikalna
        int index = w.ordinal();
        System.out.println(index); // index ko print karna (output: 0, kyunki Mon ka index 0 hai)

        // Enum ke sabhi values ko array ke roop me paa rahe hain
        Week[] WR = Week.values();
        // For-each loop se enum ke sabhi values ko iterate kar rahe hain
        for (Week w1 : WR) {
            // Har value ko uske index ke sath print karna
            System.out.println(w1 + ":" + w1.ordinal());
        }

    }
}

// Conclusion:
// Enum ka use tab karte hain jab ek set of constant values ko represent karna hota hai.
// Enum ka object nahi bana sakte.
// ordinal method se enum value ka index pata kar sakte hain.
// values method se enum ke sabhi values ko array ke roop me paa sakte hain aur unhe iterate karke use kar sakte hain.
