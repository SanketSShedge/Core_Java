//WAJP to find the maximum number in an array.

class max_arr 
{
	public static void main(String[] args) 
	{
		int[] arr={1,5,3,596,650,2,9};
		int max= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum no is:"+max);
	}
}
