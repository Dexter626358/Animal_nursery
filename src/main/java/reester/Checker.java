package reester;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Checker {
    public static boolean isNumeric(String string) {
        int intValue;
        if(string == null || string.equals("")) {
            // String cannot be parsed, it is null or empty
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            // Input String cannot be parsed to Integer
        }
        return false;
    }

    public static boolean isFloat(String string) {
        float floatValue;
        if(string == null || string.equals("")) {
            // String cannot be parsed, it is null or empty
            return false;
        }

        try {
            floatValue = Float.parseFloat(string);
            return true;
        } catch (NumberFormatException e) {
            // Input String cannot be parsed to Integer
        }
        return false;
    }

    public static boolean isNotEmpty(String string) {
        if (string == null || string.equals("")) {
            // String cannot be parsed, it is null or empty
            return false;
        } else {
            return true;
        }
    }
    public static boolean isReal(String string) {
        if (string == null || string.equals("")) {
            // String cannot be parsed, it is null or empty
            return false;
        }

        boolean result = string.matches("(?=.)([+-]?(?=[\\d\\.])(\\d*)(\\.(\\d+))?)");
        if (result) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean isCorrectValue(String string){
        if (Double.parseDouble(string) >= 0 && Double.parseDouble(string) <= 100){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isValidData(String text) {
        if (text == null || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
            return false;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setLenient(false);
        try {
            df.parse(text);
            return true;
        } catch (ParseException ex) {
            return false;
        }
    }
}
