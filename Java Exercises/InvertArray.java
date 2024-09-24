//Take an array and invert its values
public class InvertArray {
    public static int[] invertArray(int arr[])
    {
        int reversedArray[] = new int[arr.length];
        int counter = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[counter] = arr[i];
            counter++;
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 54, 43, 8, 2, 66, 9 };
        int reversedArray[] = invertArray(arr);

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
