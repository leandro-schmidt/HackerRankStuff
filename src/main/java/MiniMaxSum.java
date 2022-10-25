import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args){
        List<Integer> line = Arrays.asList(396285104,573261094,759641832,819230764,364801279);
        miniMaxSum(line);
    }

    public static void miniMaxSum(List<Integer> arr) {
        arr.sort(Comparator.comparingInt(o -> o));
        List<Integer> min = new java.util.ArrayList<>(List.copyOf(arr));
        List<Integer> max = new java.util.ArrayList<>(List.copyOf(arr));
        min.remove(min.size() - 1);
        max.remove(0);

        Long minRes = min.stream().mapToLong(Integer::longValue).sum();
        Long maxRes = max.stream().mapToLong(Integer::longValue).sum();

        System.out.println(minRes + " " + maxRes);
    }


}
