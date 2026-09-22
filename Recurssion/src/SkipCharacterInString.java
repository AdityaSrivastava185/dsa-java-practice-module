public class SkipCharacterInString {
    static void main(String[] args) {
        skipCharArg("", "baccad");
    }
    public static void skipCharArg(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch == 'a'){
            skipCharArg(processed, unprocessed.substring(1));
        } else{
            skipCharArg(processed + ch, unprocessed.substring(1));
        }
    }
}
