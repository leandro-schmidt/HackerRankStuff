import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args){
        List<Integer> line = Arrays.asList(1,1,0,-1,-1);
        plusMinus(line);
    }

    public static void plusMinus(List<Integer> arr) {
        BigDecimal size = BigDecimal.valueOf(arr.size()).setScale(6, RoundingMode.FLOOR);
        BigDecimal pos =  BigDecimal.valueOf(
                arr.stream().filter(n -> n > 0).count()).setScale(6, RoundingMode.FLOOR);
        BigDecimal neg =  BigDecimal.valueOf(
                arr.stream().filter(n -> n < 0).count()).setScale(6, RoundingMode.FLOOR);
        BigDecimal zer =  BigDecimal.valueOf(
                arr.stream().filter(n -> n == 0).count()).setScale(6, RoundingMode.FLOOR);

        System.out.println(pos.divide(size, RoundingMode.FLOOR));
        System.out.println(neg.divide(size, RoundingMode.FLOOR));
        System.out.println(zer.divide(size, RoundingMode.FLOOR));
    }
}
