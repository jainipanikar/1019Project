import java.util.*;

public class Main {
	
	

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		String upper="QWERTYUIOPASDFGHJKLZXCVBNM";
		String lower="qwertyuiopasdfghjklzxcvbnm";
		String number="0123456789";
		String specialChars="!@#$%&*{}()";
		String combination=upper+lower+specialChars+number;
		
		int len=8;
		
		char[] password=new char[len];
		
		Random r=new Random();
		
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		
		System.out.println("Your password is "+new String(password));
		
		
		}
		
		
	}

