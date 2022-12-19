//WAJP to find the minimum number in an array.

class min_arr 
{
	public static void main(String[] args) 
	{
		int arr[]={5,3,596,354,2,9};
		int min = arr[0];
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum number is: "+min);
	}
}
