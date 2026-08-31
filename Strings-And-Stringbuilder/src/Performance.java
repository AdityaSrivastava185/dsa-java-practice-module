public class Performance {
    static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.print(series + " "); // the complexity is O(N^2)
    }
}
