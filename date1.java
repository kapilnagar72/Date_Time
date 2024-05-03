package Date_Time;

import java.time.*;

public class date1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        int day = ld.getDayOfMonth();
        int month = ld.getMonthValue();
        int year = ld.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        int hour = lt.getHour();
        int minute = lt.getMinute();
        int second = lt.getSecond();
        int nano = lt.getNano();

        System.out.println(hour + "/" + minute +"/"+second+ "/" + nano);
    }
}
