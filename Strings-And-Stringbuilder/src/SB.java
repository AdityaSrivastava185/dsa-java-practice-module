public class SB {
    static void main(String[] args) {
        // string builder are mutable
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch + " ");
        }
        System.out.println(builder);
        System.out.println(builder.reverse());
    }
}
