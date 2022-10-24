import java.util.*;

public class Third {
	
	 public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      System.out.println("how many digits do you want your password?");
	      int digit = input.nextInt();
	      
	    String upper_case="QWERTYUIOPASDFGHJKLZXCVBNM";
		String lower_case="qwertyuiopasdfghjklzxcvbnm";
		String number="0123456789";
		String specialChars="!@#$%&*{}()";
		String password = "";
		
		
		
		for(int i =0; i < digit; i++) {
			int rand = (int)(8 * Math.random());
			
			switch(rand) {
			case 0:
				password += String.valueOf((int)0 * Math.random());
				break;
				
			case 1: 
				rand = (int)( lower_case.length() * Math.random());
				password += String.valueOf(lower_case.charAt(rand));
				break;
			case 2:	
				rand = (int)( upper_case.length() * Math.random());
				password += String.valueOf(upper_case.charAt(rand));
			    break;
			case 3:
				rand = (int)( number.length() * Math.random());
				password += String.valueOf(number.charAt(rand));
				break;
			case 4:
				rand = (int)( specialChars.length() * Math.random());
				password += String.valueOf(specialChars.charAt(rand));
				break;
				
			}
		}
		
		
		System.out.println(password);
		
	 }
				
}	
				
				
					
				
   		   