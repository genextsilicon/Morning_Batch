import java.util.Scanner;
class atm{
                 public static void main(String arg[])
                  {    
	    char ch;
                      do
	    {
	            int amt = 4000, pin = 1234, user;
	             
                        
                       Scanner sc = new Scanner(System.in);
                       System.out.println("Enter your pin:  ");
                       user = sc.nextInt();
                    
                       int key,  u_amt,  f_amt, n_pin;
                    
                       if(user==pin)
                       {
                              System.out.println("Press 1 for Withdraw."); 
                              System.out.println("Press 2 for Deposit.");
	            System.out.println("Press 3 for Balance Enquiry.");
                              System.out.println("Press 4 for Fast Cash.");
                              System.out.println("Press 5 for Pin Change."); 
                              System.out.println("Press 6 for Exit.");   
                              key= sc.nextInt();
                               
                               switch(key)
                               {
                                    case 1: 
                                             System.out.println("Enter amount to Withdraw :    ");
                                             u_amt = sc.nextInt();
                                              System.out.println(u_amt + " has withdrawn.");
                                              f_amt = amt - u_amt;
		          System.out.println("Balance   =   " + f_amt);
                                              break;
 
                                    case 2:
                                              System.out.println("Enter the amount to Deposit:  ");
                                              u_amt = sc.nextInt();
                                              System.out.println(u_amt + " has  Deposited");
                                              f_amt = amt + u_amt;
		          System.out.println("Final Amount  =  "+ f_amt);
                                              break;

                                    case 3: 
                                               System.out.println("Your Current Balance =   "+ amt);
                                               break;
      
                                    case 4:
                                               int n;
                                               System.out.println("Press 1 for 1000");
                                               System.out.println("Press 2 for 3000");
                                               System.out.println("Press 3 for 5000");
                                               System.out.println("Press 4 for 10,000");
                                               n = sc.nextInt();
                                            
                                               switch(n)
                                               {
                                                     case 1 : 
                                                                 if(amt>= 1000)
                                                                 {
                                  			System.out.println(1000 + "  has Withdrawn");
                                                                         f_amt = amt - 1000;
                                                                          //break; 
                                                                  }

                      		              else 
		                              {
         				System.out.println("Insufficient Amount");
				//break;
             			           }
                                                              break;

			case 2 : 
                                                                 if(amt>= 3000)
                                                                 {
                                  			System.out.println(3000 + "  has Withdrawn");
                                                                         f_amt = amt - 3000;
                                                                          //break; 
                                                                  }

			              else 
		                              {
         				System.out.println("Insufficient Amount");
				//break;
             			           }
			           break;

                                                     case 3 : 
                                                                 if(amt>= 5000)
                                                                 {
                                  			System.out.print(5000 + "  has Withdrawn");
                                                                         f_amt = amt - 5000;
                                                                         // break; 
                                                                  }
				
			               else 
		                              {
         				System.out.println("Insufficient Amount");
 				//break;
             			           }
			           break;

               			case 4 : 
                                                                 if(amt>= 10000)
                                                                 {
                                  			System.out.print(10000 + "  has Withdrawn");
                                                                         f_amt = amt - 10000;
                                                                          //break; 
                                                                  }
                                                                  else 
		                              {
         				System.out.println("Insufficient Amount");
                                                                        //break;
             			           }
                                                                 break;
                                                }
		            break;
		    
                  	case 5:
		           System.out.println("Enter New Pin:  ");
		           n_pin = sc.nextInt();
		           System.out.println("Your PIN has  changed");
		           break;

		case 6:
           		          System.exit(0);
                               }
                       }
 
                        else{
                                    System.out.println("Invalid PIN");
                       }
	          
	          
                             System.out.println("Want to Continue press 'y' :  ");
	           ch = sc.next().charAt(0);
	    }while(ch == 'y' || ch == 'Y');
                 }
}