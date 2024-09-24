//Merge two arrays 
class MergeTwoArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n;
        int nums3[] = new int[p];

        System.arraycopy(nums1, 0, nums3, 0, m);
        System.arraycopy(nums2, 0, nums3, m, n);

        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}
