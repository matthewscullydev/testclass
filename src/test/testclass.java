package test;

public class testclass {

	public static void addArray(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			arr[i] = 25 + i;
			int index = i;
			System.out.println("Your index is " + index + ". " + "It's value is " + arr[i]);

		}

	}

	public static int linearSearch(int arr[], int number) {

		int n = arr.length;

		for (int i = 0; i < n; i++) {

			if (arr[i] == number)
				return i;
		}

		System.out.println("Could not find your number");
		return -1;

	}

	public static void main(String args[]) {
		int[] Array = new int[20];

		addArray(Array);
		int result = linearSearch(Array, 43);

		if (result == -1) {
			System.out.println("You're number is not in the array");
		} else
			System.out.println("You're number is at position " + result);
	}

}
