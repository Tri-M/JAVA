import java.util.Arrays;

public class Main {
    
    static int[] linearSearch(int[][] arr, int num)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == num) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };
	}
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int target = 8;
		int ans[] = linearSearch(arr, target);
		System.out.println("Element found at index: "
						+ Arrays.toString(ans));
	}

	}
