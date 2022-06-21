import java.util.Scanner;
import java.util.regex.*;


class CustomerReg extends Main{
	  
	protected boolean isStringOnlyAlphabet(String name)
    {
 
        return ((name != null) && (!name.equals(""))
                && (name.matches("^[a-zA-Z]*$")));
    }
	
	protected boolean nameReq(String name) {
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		 	  
	       Pattern p = Pattern.compile(regex);

	        if (name == null) {
	            return false;
	        }
	  
	    Matcher m = p.matcher(name);
       return m.matches();	}
	
	protected boolean isValidPassword(String password) {
		 String regex = "^(?=.*[0-9])"
                 + "(?=.*[a-z])(?=.*[A-Z])"
                 + "(?=.*[@#$%^&+=])"
                 + "(?=\\S+$).{8,20}$";
		 	  
	       Pattern p = Pattern.compile(regex);

	        if (password == null) {
	            return false;
	        }
	  
	    Matcher m = p.matcher(password);
        return m.matches();
	    }
	
	
	protected String initials(String first, String last) {
		char firstIntial =  first.charAt(0);
		char lastInital = last.charAt(0);
		
		String initialBoth = "first initial: " + firstIntial +  " last initail: " + lastInital;
		
		return initialBoth;
		
		}
	
	protected void testLogin(Scanner scanner, String username, String password) {
		scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the login page:");
		System.out.println("Enter User Name:");
		String inputUN = scanner.next();
		System.out.println("Enter Password:");
		String inputPW = scanner.next();
		
		if(inputUN.equals(username) && inputPW.equals(password)){
			System.out.println("User successfully Logged in");
		}else{
			
				System.out.println("Please try again");
				testLogin(scanner,username,password);
			
		}
		
	}
	
	
}
