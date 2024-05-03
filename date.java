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

    public static int getYear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getYear'");
    }

    public static int getMonthofYear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMonthofYear'");
    }

    public static int getDayOfMonth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDayOfMonth'");
    }

    public static int getMonthValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMonthValue'");
    }
}
