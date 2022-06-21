import java.util.Scanner;
import java.util.regex.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first temperature");
		int tempOne = scanner.nextInt();
		System.out.println("Enter second temperature");
		int tempTwo = scanner.nextInt();
		
		int changedVariable = 0;
		
				int add = tempOne + tempTwo;
				int subtraction = tempOne - tempTwo;
				int mult = tempOne * tempTwo;
				int div = tempOne / tempTwo;
				System.out.println("currnet value of div equals " + div);
				
				changedVariable = add;
				if (changedVariable == add) {
					System.out.println("change to variable occured");
				}
				else {
					System.out.println("change did not occur");
				}
				System.out.println("changedVariable now equals "+ changedVariable);
				
			
				System.out.println("Results: Addition " + add + " Subtraction " + subtraction + " Multiplcation "+ mult);

				int tempConv1 = temperature(tempOne);
				int tempConv2 = temperature(tempTwo);
				System.out.println("Degrees in F: "+tempConv1+ " Degrees in C: "+ tempConv2);
				System.out.println();
				
				
				System.out.println("***************************");
				System.out.println("Enter user Registration: ");
				CustomerReg customerreg = new CustomerReg(); 

				System.out.println("Enter First Name: ");
				String firstName = scanner.next();
				
				while(!customerreg.isStringOnlyAlphabet(firstName)) {
					System.out.println("Letters only, please reenter first name");
					firstName = scanner.next();
				}
				
				System.out.println("Enter Last Name: ");
				String lastName = scanner.next();
				
				while(!customerreg.isStringOnlyAlphabet(lastName)) {
					System.out.println("Letters only, please reenter last name");
					lastName = scanner.next();
				}
				
				String init = customerreg.initials(firstName, lastName);
				
				System.out.println(init);
				
				System.out.println("Create a Username:");
				String userName = scanner.next();
				
				System.out.println("Enter a password. Must contain at least character, UpperCase and LowerCase letter. Must be in between 8 to 20 characters");
				String password = scanner.next();
				
				while(!customerreg.isValidPassword(password)) {
				System.out.println("Enter a password. Must contain at least character, UpperCase and LowerCase letter. Must be in between 8 to 20 characters");
				password = scanner.next();
				}
				
				System.out.println("Reenter Password");
				String passwordTwo = scanner.next();
				
				while(!passwordTwo.equals(password)) {
					System.out.println("Second entry does not match. Please reenter the password a second time");
					passwordTwo = scanner.next();
				}
				
			System.out.println("Registraion complete");
			System.out.println("***************************");

			customerreg.testLogin(scanner, userName, passwordTwo);
	
	}
	
	public static int temperature(int celsius) {
		int waterTP = 32;
		int tempReturn = (int) ((celsius*1.8)+waterTP);
		return tempReturn;
	}

}
