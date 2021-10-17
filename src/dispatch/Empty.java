package dispatch;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class Empty {
    public static void main(String[] args) {
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        java.sql.Time time = new java.sql.Time(Calendar.getInstance().getTime().getTime());
        System.out.println(sqlDate);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
    }
}
