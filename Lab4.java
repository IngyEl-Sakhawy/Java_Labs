class Lab4{
	
	public static void main (String args[])
	{   long before = System.currentTimeMillis();
		
		double arr[]=new double[20];
		outter: for (int i= 0 ; i<arr.length ; i++)

		{   
			double x=Math.random()*1000;
			for (int k =0 ; k<i ; k++)
			{
				if (x == arr[k])
				{
				System.out.println("found a match");
				break outter;
				} 
			}
			arr[i]=x;
		}	
		
		
		double temp = arr[0];
		double max= arr[0],min= arr[0];
		
		for( int j=1 ; j<arr.length ; j++)
		{
			if ( temp < arr[j]){
				temp=arr[j];
				max=temp;
			} else if (temp> arr[j] ){
				temp=arr[j];
				min=temp;
			}
			
				
		}
		
		
	System.out.println("Minimum is "+ min);
    System.out.println("Maximum is "+ max);	
	long after = System.currentTimeMillis();
    System.out.println("before comp time in milliseconds: " + before);
	System.out.println("after comp time in milliseconds: " + after);
	double runtime= after-before;
	System.out.println("time taken in milliseconds: " + runtime);
	}
}