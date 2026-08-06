import java.util.Arrays;

public class SearchInStrings {
    static void main(String[] args) {
        String name = "hello";
        char TargetChar = 'H';
        System.out.println(LinearSearchInString(name, TargetChar));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    public static boolean LinearSearchInString(String str, char targetChar){
        if(str.length() == 0){
            return false;
        }
        // run the loop
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == targetChar){
                return true;
            }
        }
        return false;
    }
}
