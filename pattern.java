class pattern{
   	          public static void main(String arg[]){
	          int i , j;
	          
	          for(i = 1; i <= 5; i++)
	          {
	                for(j = 1; j<=9; j++)
	                {
		  if((j==5 && i%2 != 0) || (i == 5 && j%2 !=0))
		  {
		      System.out.print("* ");
		  }
		 
		  else
		  {
		      System.out.print("  ");
		  }
                                  }
	               System.out.println();
	          }


            }
}

class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
        // Loop for printing spaces
        for (int j = 1; j <= 5 - i; j++) {
            System.out.print(" ");  // Print space to center 
        }

        // Loop for printing stars with spaces in between
        for (int k = 1; k <= i; k++) {
            System.out.print("*");  // Print a star
            if (k < i) {
                System.out.print(" ");  // Print a space between stars, 
            }
        }

        // Move to the next line after each row
        System.out.println(" ");
    }
    }
}