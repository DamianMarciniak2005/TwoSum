// Import HashMap to store array values and their indices
import java.util.HashMap;

public class TwoSum 
{
	public static void main(String[] args) 
	{
		// Sample array
		int[] arr1 = {2, 7, 11, 15};
		
		// Calling brute-force approach
		twoSumLong(arr1, 9);
		
		// Calling optimized approach
		twoSumShort(arr1, 9);
	}

	public static void twoSumLong(int[] array, int target) 
	{ // Time-complexity of O(n^2)
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i + 1; j < array.length; j++) 
			{
				if (array[i] + array[j] == target) 
				{
					System.out.println("The indices which equal a target of " + target + " are at: " + i + " and " + j);
					// Return the two indices of both numbers which add to the sum
				}
			}
		}
	}
	
	public static void twoSumShort(int[] array, int target) 
	{ // Time-complexity of O(n)
		HashMap<Integer, Integer> map = new HashMap<>();
		// Stores array values and their indices
		
		for (int i = 0; i < array.length; i++) 
		{
			int complement = target - array[i]; 
			// Calculate the needed complement
			
			if (map.containsKey(complement)) 
			{ 
				System.out.println("The indices which equal a target of " + target + " are at: " + map.get(complement) + " and " + i);
				// Return the two indices of both numbers which add to the sum
			}
			else 
			{
				map.put(array[i], i);
				// Store the value and index in HashMap
			}
		}
	}
}
