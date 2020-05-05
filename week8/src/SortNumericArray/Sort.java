package SortNumericArray;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 5, 3, 6, 2, 1, 4 };
		sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

	public static int[] sort(int[] list) {
		int i, j, temp = 0;
		for (i = 0; i < list.length; i++) {
			for (j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;

				}
			}
		}
		return list;
	}

}
