public class HackerRankInString {

    public static void main(String[] args){
        System.out.println(hackerrankInString("hereiamstackerrank"));
    }

    public static String hackerrankInString(String s) {
        char[] letters = {'h','a','c','k','e','r','r','a','n','k'};
        int currentLetter = 0;

        for (int i = 0; i < s.length() && currentLetter < 10; i++) {
            currentLetter += (s.charAt(i)==letters[currentLetter]) ? 1 : 0;
        }

        return currentLetter  == letters.length ? "YES" : "NO";
    }
}
