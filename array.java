import java.util.Scanner;
class array{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j, k, m, num = 1;
		int[] arr = new int[5];
		
		System.out.println("Enter 5 elements  : ");
		for(k = 0 ; k<5 ; k++)
		{
			arr[k] = sc.nextInt();
		}
		for(m = 0; m<5 ; m++)
		{
			System.out.println(arr[m]);
		}

		for(i = 0; i<5; i++)
		{
			num = 1;
			for(j = 1; j <= arr[i]; j++)
			{
				num = num*j;
			}
			arr[i] = num;
			System.out.println(arr[i]);
		}
	}
}




	       