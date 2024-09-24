//Most frequent int on array
public class FrequentInt
{
	public static void main(String[] args) {
		int arr[] = { 8, 8, 54, 43, 8, 2, 66, 9 };
		int aux = 0, num = 0, count1 = 0, count2 = 0;

		for (int i = 0; i < arr.length; i++) {
			aux = arr[i];

			for (int j = 0; j < arr.length; j++) {
				if (aux == arr[j]) {
					count1++;
				}
			}

			if (count1 > count2) {
				num = aux;
			}

			count2 = count1;
			count1 = 0;
		}

		System.out.println("Numero que mais repete: " + num);
	}
}