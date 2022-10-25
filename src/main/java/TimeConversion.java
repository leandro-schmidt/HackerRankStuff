import java.util.Arrays;
import java.util.List;

public class TimeConversion {

    public static void main(String[] args){
        System.out.println(timeConversion("07:01:00AM"));
    }

    public static String timeConversion(String s) {
        int hrs = Integer.parseInt(s.substring(0, 2));
        if (s.contains("PM") && hrs != 12){
            hrs = hrs + 12;
        } else if ((s.contains("AM") && hrs == 12)){
            hrs = 0;
        }
       return (hrs < 10 ? "0" + hrs : hrs)  + s.substring(2, s.length() - 2);
    }
}
