package Date_Time;

//import java.util.Date;

public class date {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long timems = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(timems);
        System.out.println(dt1);
    }
}
