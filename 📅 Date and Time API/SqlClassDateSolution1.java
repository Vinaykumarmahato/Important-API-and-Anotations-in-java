public class SqlClassDateSolution1 {
    public static void main(String[] args) {
        java.util.Date dt1 = new java.util.Date(); // eske constructor me koe parameters nahi hoga

        long timeinms = dt1.getTime();


        java.sql.Date dt2 = new java.sql.Date(timeinms); // it wont be zero  .parameters, eske constructor me parameter hoga hi hoga 
        // jo sql ke andar date class hai wo sirf aapko date return karega but jo normal date class hai wo aapko time date and Zone sb return karega


        System.out.println(dt2);


    }
}
