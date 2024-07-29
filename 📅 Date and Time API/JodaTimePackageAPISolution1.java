import java.time.*;
public class JodaTimePackageAPISolution1 {
    
    public static void main(String[] args) {

        LocalDate date=LocalDate.now();
        System.out.println("The Date is Below");
        System.out.println("Date: "+date);
        System.out.println("-----------------------------------");


        System.out.println("Day of the month");
        int day=date.getDayOfMonth();
        System.out.println("Day os the month: "+day);
        System.out.println("-----------------------------------");

        System.out.println("Get Month");
        int month=date.getMonthValue();
        System.out.println(month);
        System.out.println("-----------------------------------");

        System.out.println("Get Year");
        int year=date.getYear();
        System.out.println(year);
        System.out.println("-----------------------------------");

        System.out.println("all in one");
        System.out.println(day+"/"+month+"/"+year);


        
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("Local Time..........");
        LocalTime Time=LocalTime.now();
        int hour=Time.getHour();
        int min=Time.getMinute();
        int second=Time.getSecond();
        int ns=Time.getNano();
        System.out.println(hour+":"+min+":"+second+":"+ns);

        
    }
}
