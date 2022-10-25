import java.util.*;
import java.util.stream.Collectors;

public class BirthDayCakeCandles {

    public static void main(String[] args){
        List<Integer> line = Arrays.asList(4,4,1,3);
        System.out.println(birthdayCakeCandles(line));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        Optional<Integer> max = candles.stream().max(Comparator.comparingInt(o -> o));
        List<Integer> biggest = candles.stream().filter(it -> Objects.equals(it, max.get())).collect(Collectors.toList());
        return biggest.size();
    }

}
