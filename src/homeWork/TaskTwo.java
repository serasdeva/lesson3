package homeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 3, 4, 6, 1, 2, 6, 5, 8));
        nums.removeIf(cur -> cur % 2 == 0);
        System.out.println(nums);
    }

}
