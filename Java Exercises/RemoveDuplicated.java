//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
//The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

import java.util.HashSet;
import java.util.Set;

class removeDuplicated {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> checkedInts = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (checkedInts.contains(nums[i])) {
                continue;
            }
            else
            {
                k++;
                checkedInts.add(nums[i]);
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 8, 54, 43, 8, 2, 66, 9, 8, 8, 41, 1, 8 };
        int k = removeDuplicates(nums);

        System.out.println(k);
    }
}
