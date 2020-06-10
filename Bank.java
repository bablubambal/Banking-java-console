import java.util.*;

/**
 * 
 */

/**
 * @author Bablu
 * The Bank System Console
 *
 */
public class Bank {

	public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int userInput;
   String name;
   double[] bankbalances = new double[250];
   String[] accountnames = new String[250];
   int size = 0;
  
		while(1==1) {
		System.out.println("\n\t\tWelcome to The Banking Application");
		 
	
		System.out.println("********************\n Banking Menu\n********************");
		System.out.println("[1]:Add a Customer to Bank \n[2]:Channge Account holder name\n[3]:Check Balance in your Account\n[4]: Bank Summary\n[-1]: Quit");
		userInput = input.nextInt();
		//System.out.print(userInput);
		
		if(userInput == 1) {
			System.out.println("Welcome Add a new user to Bank:");
			System.out.println("Please Enter your Name:");
			name = input.next();
			//System.out.println(name);
	        accountnames[size]= name;
			System.out.println("Enter the Amount in Your Bank ");
			int balance = input.nextInt();
			bankbalances[size]=balance;
			input.hasNextLine();
		    System.out.print("The customer id is: "+size);
		    size ++;
			
		}
		else if(userInput ==2) {
			System.out.println("Change Account holder name");
			System.out.println("Enter the Accout Number");
			int id = input.nextInt();
			System.out.println("Please Enter your Name:");
			accountnames[id] = input.next();
			System.out.println("Account Holder name updated");
			
		}
		else if(userInput ==3) {
			System.out.println("Check Balance in Account");
			System.out.println("Enter the Accout Number");
			int id = input.nextInt();
			System.out.println("The Account Balance is in your account is : " +bankbalances[id] );
			
					
		}
		else if(userInput ==4) {
			double total=0;
			System.out.println("Bank summary here:\n");
			for(int i=0;i<size;i++ ) {
				System.out.println("The customer with id "+i+ " name : "+accountnames[i]+ "  with balance :"+bankbalances[i]);
				total = total+bankbalances[i];
			}
			System.out.println("The Bank has total"+ size+ " Customers and with"+ total +"  balance in the account");
			
		}
		
		else if(userInput == -1) {
			System.out.println("Exiting form the Bank .......");
			//break;
			System.out.println("Exited successfully .");
			System.exit(0);
			
		}
		else {
			System.out.print("\n\n Enter a valid choice");
			
		}
		
		}
		//System.out.println("Your are Exited From the Bank \n\n Thank you ");

	}

}
