public class Pangram {

    public static void main(String[] args){
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

    public static String pangrams(String s) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','w','y','z'};
        boolean isPangram = true;

        for (char c : alphabet) {
            if (!s.contains(c + "") && !s.contains(Character.toUpperCase(c) + "")) {
                isPangram = false;
                break;
            }
        }

        return isPangram ? "pangram" : "not pangram";
    }
}
