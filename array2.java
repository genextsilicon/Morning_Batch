import java.util.Scanner;
class arr2{
	    public static void main(String arg[]){
	    int[][] arr = {{1,2,3,1,4},{4,5,6,2,3},{7,8,9,4,5},{2,4,6,8,2},{1,2,3,4,1}};
	  
	     int sum = 0;
	       for(int i = 0; i < 5 ; i++ )
	       {   
	         for(int j = 0; j < 5 ; j++)
	          {
		if(i == j ||  j == 4-i)
		{
		     System.out.print(arr[i][j] + " ");
		     sum += arr[i][j];
		}
		else
		{
		      System.out.print("  ");
		}
	          }
	          System.out.println();
	    } 
	     
	System.out.println("Sum =  " +  sum);
  }
}