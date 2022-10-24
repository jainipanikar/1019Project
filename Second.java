import java.util.*;
public class Second {
	
	
	public static void main(String [] args){
		
	
		String password = "";
        String temp = "";
        int randLetter = 0;
        int randNumber = 0;
        int randPunct = 0;
        int charSelection = 0;
        int counter = 0;
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String symbols = "!?%&*?<>";
       	
        
	

        Scanner in = new Scanner(System.in);

        System.out.println("Please choose what characters you would like to use.");
        System.out.println("[A] Lowercase Letters");
        System.out.println("[B] Lowercase & Uppercase Letters");
        System.out.println("[C] Lowercase, Uppercase, Numbers");
        System.out.println("[D] Lowercase, Uppercase, Numbers, Symbols");
        System.out.println("Selection: ");
        String selection = in.next();
        
	
        System.out.print("Select a length (8 - 128): ");
        int length = in.nextInt();{
	  
	



        if(selection.equalsIgnoreCase("A")){
        
            for (int i = 0; i < length; i++){
                randLetter = 1 + (int)(Math.random() * 26); 
                temp = lowerCase.substring(randLetter - 1 , randLetter); 
                password += temp;  
                
            }
        }
        else if(selection.equalsIgnoreCase("B")){
            while (counter < length){
                for (int i = 0; i < length; i++){

                    charSelection = 1 + (int)(Math.random() * 10); 

                    if (charSelection < 5){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = lowerCase.substring(randLetter - 1 , randLetter);
                        counter++;
                        password += temp; 
                    }
                    else if (charSelection > 5 && charSelection < 10){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = upperCase.substring(randLetter - 1 , randLetter);
                        counter++;
                        password += temp;  
                    }
                }
            }
        }
        else if(selection.equalsIgnoreCase("C")){
            while (counter < length){
                for (int i = 0; i < length; i++){

                    charSelection = 1 + (int)(Math.random() * 17);
                    randNumber = 1 + (int)(Math.random() * 9);

                    if (charSelection < 5){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = lowerCase.substring(randLetter - 1 , randLetter);
                        counter++;
                        password += temp;
                    }
                    else if (charSelection > 5 && charSelection < 10){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = upperCase.substring(randLetter - 1 , randLetter);
                        counter++;
                        password += temp;
                    }
                    else if (charSelection > 15 && charSelection < 17){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = number.substring(randNumber - 1 , randNumber);
                        counter++;
                        password += temp;
                    }
                }
            }
        }
        else if(selection.equalsIgnoreCase("D")){
            while (counter < length){
                for (int i = 1; i < 0; i++){

                    charSelection = 1 + (int)(Math.random() * 20); 
                    randNumber = 1 + (int)(Math.random() * 9);
                    randPunct = 1 + (int)(Math.random() * 2);
                    if (charSelection < 5){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = lowerCase.substring(randLetter - 1 , randLetter);
                        counter++;
                        password += temp;
                    }
                    else if (charSelection > 5 && charSelection < 10){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = upperCase.substring(randLetter - 1 , randLetter);
                        counter++;
                        password += temp;
                    }
                    else if (charSelection > 15 && charSelection < 17){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = number.substring(randNumber - 1 , randNumber);
                        counter++;
                        password += temp;                 
                    }
                    else if (charSelection > 17){

                        randLetter = 1 + (int)(Math.random() * 26); 
                        temp = symbols.substring(randPunct - 1 , randPunct);
                        counter++;
                        password += temp;   
                    }
                         
                }
            }
        }
        Scanner keyboard = new Scanner(System.in);
			System.out.print("Do you want another password?: ");
			int yesno = in.nextInt();{
				String response = keyboard.next();	
				
				while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
					  System.out.println("\nInvalid response. Try again.");
					  
					response = keyboard.next();
					} 
					if (response.equalsIgnoreCase("n")) {
					  System.out.println("\nCome back next time, " + ".");
					} else {
					  System.out.println("\nGreat! Let's get started.");
					}	
			}
		}
        
	        System.out.print(password); 
                
        }
	}

    

 


		

            
		
	