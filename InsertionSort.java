/* Insertion Sort
*/

public class InsertionSort 
{
	public static void main(String[] args)
	{
		int [] nums = {32, 6, 12, 9, 76, 11, 5, 3, 90, 13};

		System.out.println("Original array is : ");
		for(int n : nums)
			System.out.print(n + " ");
		
		insertionsort(nums);  //pass the array --> only give the name

		System.out.println("\nAfter sorting, array is : ");
		for(int n : nums)
			System.out.print(n + " ");
	}

		
	public static void insertionsort(int[] nums)    //receive the array --> give full details like int .....
	{
		for (int i = 1; i < nums.length; i++) 
		{
			/* Insert nums[i] into a sorted sublist nums[0..i−1] so that
			nums[0..i] is sorted. */
		
			int temp = nums[i];
			int k;
		
			for (k = i - 1; k >= 0 && nums[k] > temp; k--) 
			{
				nums[k + 1] = nums[k];
			}

			// Insert the current element into nums[k + 1]
			nums[k + 1] = temp;
		}
	}
}