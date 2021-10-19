package za.ac.cput.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class GenericHelper {
    public static String generateAnId() {
        return UUID.randomUUID().toString(); }

    public static String generateDate() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String dateString = dateFormat.format(date);
        return dateString; }



}
