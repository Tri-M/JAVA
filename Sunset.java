class Main {

	static int Sunset(int arr[], int n)
	{
		int count = 1;
		int maximum = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > maximum|| arr[i] == maximum) {
				count++;
				maximum = arr[i];
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		int arr[] = { 7, 4, 8, 2, 9 };
		System.out.println(Sunset(arr, arr.length));
	}
}
