public class SubSeq {
    static void main(String[] args) {
        subseq("", "abc");
    }
    public static void subseq(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        subseq(processed + ch, unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }
}
