package test;

public class testclass {

	public static void addArray(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			arr[i] = 25 + i;
			int index = i + 1;
			System.out.println("Your index is " + index + ". " + "It's value is " + arr[i]);

		}

	}

	public static int linearSearch(int arr[], int number) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int index = i + 1;

			if (arr[i] == number)
				System.out.println("You're number is at position " + index);
			return i;
		}

		return -1;

	}

	public static void main(String args[]) {
		int[] Array = new int[20];

		addArray(Array);
		linearSearch(Array, 25);

	}

}
