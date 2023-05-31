public class FrequencyOfElement{
	
	public static void main(String[] args)
	{
		int array[]= {1,5,8,5,4,18,19,18,18,18};
		 int i;
		int array1[]= new int[array.length+2];
		
		for(i=0;i<array.length;i++)
		array1[array[i]]++;
		
		for(i=0;i<array1.length;i++)
			if(array1[i]>0)
				System.out.println(i +" => "+array1[i]);
	}
}
