import java.util.Scanner;
class prac2{
	public static void main(String arg[])
	{
		int  i, j;
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {5, 4, 3, 2, 1}; 
		int[] arr3 = new int[5];

		for(i = 0 ; i<5 ; i++)
		{
			for(j = 4;  j>=0; j--)
			{
				arr3[i] = arr1[i] + arr2[j];
				System.out.println(arr3[i]);
				i++;
					
			}
			break;
		}
	}
}