//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

class removeDuplicated {
    public static int removeDuplicates(int[] nums) {


        return 1;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 8, 54, 43, 8, 2, 66, 9 };
        int k = removeDuplicates(nums);

        System.out.println(k);
    }
}