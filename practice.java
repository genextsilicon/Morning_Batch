import java.util.Scanner;
class prac{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int num, i, a = 0;
		int[] arr = {12, 34, 6, 24, 10};

		System.out.print("Enter the no. to search :  ");
		num = sc.nextInt();

		for(i = 0 ; i<5 ; i++)
		{
			if(arr[i]==num)
			{
				a = 1;
				System.out.println(arr[i] + " found on " + (i+1) +" position");
				break;
			}
		}

		if(a==0)
		{
			System.out.print(num + " not found");
		}
	}
}