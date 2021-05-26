// Java Program to find maximum in arr[]
public class ProgramIncorrect
{	
	// Method to find maximum in arr[]
	static int findMax(int[] arr) throws IllegalArgumentException
	{
		// Initialize maximum element
		if (arr.length == 0)
			throw new IllegalArgumentException();
		int max = arr[0];
	
		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < arr.length; i++)
			if (arr[i] < max)
				max = arr[i];
	
		return max;
	}
	
	// Driver method
	public static void main(String[] args)
	{   
        int arr[] = {10, 324, 45, 90, 9808};
		System.out.println("Largest in given array is " + findMax(arr));
	}
}