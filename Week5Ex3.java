import java.util.Scanner;
import java.util.Random;

public class Week5Ex3 {
    
    public static void main(String[] args) {
    	
    	int RanNum = 0;       //Random number that generated will store at here
    	int GuessNum = 0;     //input number from the user to guess the number
    	int agn;             //variable as enf of file indicator
    	
    	Scanner input = new Scanner( System.in );
    	Random randomNumbers = new Random();    //random number Generator
    	
    	do{
	        System.out.print("Guess the number\n");
	        System.out.print("---------------------\n");
	        
	        RanNum = 1 + randomNumbers.nextInt(1000);  // random number between 1 to 1000
	       	
	       	do{
	       		System.out.print("\n\nGuess the number between 1 to 1000:");
	        	GuessNum = input.nextInt();
	        	
		       	if(GuessNum > RanNum ){
		       		System.out.print("Too high. Try again.");
		       	}else if(GuessNum < RanNum){
		       		System.out.print("Too low. Try again.");
		       	}else if(GuessNum==RanNum){
		       		System.out.printf("Congratulations. You guess the number!");
		       	}
	       	}while(GuessNum!=RanNum);
	       	
	       	System.out.printf("\n\nDo you want to play again?(Press 1 for Yes Press 0 for No):");
	       	agn = input.nextInt();
   		}while(agn == 1);
    }
}