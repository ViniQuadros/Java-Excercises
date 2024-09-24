//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
//The order of the elements may be changed. 
//Then return the number of elements in nums which are not equal to val.

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[i + 1];
            }
            else
            {
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 8, 54, 43, 8, 2, 66, 9 };
        int k = removeElement(nums, 8);

        System.out.println(k);
    }
}
