import java.util.Arrays;
import java.util.List;

public class StairCase {

    public static void main(String[] args){
        staircase(4);
    }

    public static void staircase(int n) {
        String output = "";
        for (int i = 1; i <= n; i++) {
            output = " ".repeat(n - i);
            output += "#".repeat(i);
            System.out.println(output);
        }
    }
}
