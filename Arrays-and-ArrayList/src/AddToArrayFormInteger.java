import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormInteger {
    public static void main(String[] args) {
        int[] nums = {1,2,0,0};
        int[] nums2 = {2,7,4};
        int[] nums3 = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(nums2, 108));

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }

            list.add(k % 10);
            k /= 10;
            i--;
        }

        // Reverse the list manually
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        return list;
    }
}
