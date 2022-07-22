
class Main
{
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
		{
			int minimum = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[minimum])
					minimum = j;
			int temp = arr[minimum];
			arr[minimum] = arr[i];
			arr[i] = temp;
		}
	}
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		Main ob = new Main();
		int arr[] = {68,76,90,70,45,71};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}

 
