import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args){
        List<Integer> line2 = Arrays.asList(11,2,4);
        List<Integer> line3 = Arrays.asList(4,5,6);
        List<Integer> line4 = Arrays.asList(10,8,-12);
        List<List<Integer>> arr = Arrays.asList( line2, line3, line4);
        System.out.println(diagonalDifference(arr));
    }

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer leftToRightDiagonalSum = 0;
        Integer rightToLeftDiagonalSum = 0;
        Integer numberOfRowsAndColumns = arr.get(0).get(0);

        for(int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--){
            leftToRightDiagonalSum += arr.get(i).get(i);
            rightToLeftDiagonalSum += arr.get(i).get(j);
        }


        return Math.abs(leftToRightDiagonalSum - rightToLeftDiagonalSum);
    }
}
