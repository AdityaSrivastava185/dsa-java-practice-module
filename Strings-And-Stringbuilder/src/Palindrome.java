public class Palindrome {
    static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }
    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        if(word == null || word.length() == 0){
            return true;
        }
        for (int i = 0; i < word.length()/2; i++) {
            char start = word.charAt(i);
            char end = word.charAt(word.length() -1 -i);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
