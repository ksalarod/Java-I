import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		int guess = 0;
		int userInput = 0;
		
		do {     
		    System.out.println("Guess what number I'm thinking!");
		    userInput = input.nextInt();
             
            if (userInput == guess) {
               System.out.println("You guessed it!");
	       } else {
		          System.out.println("Wrong, try again.");
		          
		   }
        
        } while (userInput != guess);
        
        input.close();
     
	}
}
