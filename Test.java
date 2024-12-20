import java.util.Scanner;

class loop {
    public static void main(String[] args) {
        int rev = 0, r, k = 101, i=0, o;
	    while(k<= 199)
	    {  
	          i = k;
	          o = k;
	          rev = 0;
	          
	         while(i != 0)
	         {
	              r = i%10;
	              rev = rev*10 + r;
	              i = i/10;
	          }
	       
	          if(rev == o)
	          {
	              System.out.println(o);
	           }
	           k++;
	     }
    }
}