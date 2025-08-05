import java.util.Random;
import java.util.Scanner;

    /*
     * add a "difficulty" setting — like easy (0–50), medium (0–100), hard (0–500) - OKIDOKI check
     * 
     * Make it replayable ? ?
     * Add input range validation ??
     * Format a bit more ???
     */

public class NumberGuessing {
    public static void main (String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userInput, counter=0, difficulty=0, number=1; // counter to keep count of user tries in the guessing

        //difficulty setting
        System.out.println("Choose a difficulty: ");
        System.out.println("1. Easy (0-50)");
        System.out.println("2. Medium (0-100)");
        System.out.println("3. Hard (0-500)");
        System.out.println("4. Exit");

        //looping,  only works 1-3 and checks if its numbah
        while(true){
            if(scanner.hasNextInt()){
                difficulty = scanner.nextInt();
                switch (difficulty) {
                    case 1:
                        number = random.nextInt(51);
                        System.out.println("\nGuess the number from 0 to " + 50);
                        break;
                    case 2:
                        number = random.nextInt(101);
                        System.out.println("\nGuess the number from 0 to " + 100);
                        break;
                    case 3:
                        number = random.nextInt(501);
                        System.out.println("\nGuess the number from 0 to " + 500);
                        break;
                    case 4:
                        System.out.println("BYEEEE! "); //change it later
                        break;
                    default:
                        break;
                }
                break;
            }else {
                System.out.println("Invalid input. please enter a number");
                scanner.next();
            }
        }

        //DELETO LATER. IS ONLY FOR CHECKINGG
        //System.out.println("CHECKCHEK NUMBAH  " + number + " DIFFFF: " + difficulty);


        //number guessing checker
        while(true){

            //if user chose toquit 4. end game
            if(difficulty==4){
                break;
            }
            
            if(scanner.hasNextInt()){
                userInput = scanner.nextInt();
                counter++;
                
                if (userInput == number){
                    System.out.println("Correct! number is " + number);
                    System.out.println("You took " + counter + " tries");
                    break;
                } else {
                    if(userInput>number){
                        System.out.println("number is smaller than " + userInput);
                    } else{
                        System.out.println("number is bigger than " + userInput);
                    }
                }
            } else {
                System.out.println("Invalid input. please enter a number");
                scanner.next();
            }
        }
    }
}