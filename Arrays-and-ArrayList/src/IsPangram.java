import java.util.Arrays;

public class IsPangram {
    static void main(String[] args) {
        System.out.println(isPangram("thequickbrownfoxjumpsoverthelazydogggggg"));
    }
    public static boolean isPangram(String sentence){
        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            int index = ch - 'a';

            arr[index] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                return false;
            }
        }

        return true;
    }
}
