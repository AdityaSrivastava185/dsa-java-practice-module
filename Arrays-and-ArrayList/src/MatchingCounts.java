import java.util.List;

public class MatchingCounts {
    static void main(String[] args) {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "macbook"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";
        int result = countMatches(items, ruleKey, ruleValue);

        System.out.println(result);
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}