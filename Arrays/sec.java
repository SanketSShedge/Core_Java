class secLarge 
{
	public static void main(String[] args) 
	{
		int a[]={1,15,6,4,80,50};
		int temp=0;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i] < a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second largest element is:"+a[1]);
	}
}