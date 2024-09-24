//Take an array and a result.
//See if it is possible to get te result by adding 2 array values together
public class SumTwo {
    public static void sum(int arr[], int result)
    {
        int num1 = 0, num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == result) {
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }

        if (num1 != 0 && num2 != 0) {
            System.out.println("Num1: " + num1 + " Num2: " + num2);
        }
        else
        {
            System.out.println("Sum could not be done.");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 8, 54, 43, 8, 2, 66, 9 };

        sum(arr, 91);
    }
}