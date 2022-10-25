import java.util.*;

public class WeightedUniformStrings {

    public static void main(String[] args){
        System.out.println(weightedUniformStrings("abccddde", List.of(6, 1, 3, 12, 5, 9, 10)));
    }


    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        s = s.toLowerCase();
        List<String> ans = new ArrayList<>();
        int i = 1;
        String temp =""+s.charAt(0);
        Set<Integer> list = new HashSet<>();
        int w = s.charAt(0)-97+1;
        list.add(w);
        while(i<s.length()){
            if(s.charAt(i)!=temp.charAt(0)){
                temp = ""+s.charAt(i);
                w = s.charAt(i)-97+1;
            }else{
                temp+=s.charAt(i);
                w+=s.charAt(i)-97+1;
            }
            list.add(w);
            i++;
        }
        for(Integer q : queries){
            if(list.contains(q)){
                ans.add("Yes");
            }else{
                ans.add("No");
            }
        }
        System.out.println(list);
        return ans;
    }

}
