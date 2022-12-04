package homeWork;

import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 5, 100, 7, 23, 56, 1, -6);
        int max = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
