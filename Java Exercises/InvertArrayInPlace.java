//Take an array and invert its values in place
public class InvertArrayInPlace {
    public static int[] invertArrayInPlace(int arr[])
    {
        int aux = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            aux = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = aux;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 54, 43, 8, 2, 66, 9, 10 };
        int reversedArray[] = invertArrayInPlace(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
