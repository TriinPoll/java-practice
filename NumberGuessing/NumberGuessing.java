import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main (String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userGuess, counter=0, difficulty=0, randNumber=1; // counter to keep count of user tries in the guessing

        difficulty= menyChoise(difficulty, scanner);
        randNumber = randomNumber(difficulty, randNumber, random);

        //DELETO LATER. IS ONLY FOR CHECKINGG
        System.out.println("CHECKCHEK NUMBAH  " + randNumber + " DIFFFF: " + difficulty);

        //number guessing checker
        while(true){
            // 4. to end game / quit program
            if(difficulty==4){
                break;
            }
            
            if(scanner.hasNextInt()){
                userGuess = scanner.nextInt();
                counter++;
                
                if (userGuess == randNumber){
                    System.out.println("Correct! number is " + randNumber);
                    System.out.println("You took " + counter + " tries");

                    difficulty= menyChoise(difficulty, scanner);
                    if(difficulty==4){
                        break;
                    } else{
                        randNumber = randomNumber(difficulty, randNumber, random);
                    }
                } else {
                    if(userGuess > randNumber){
                        System.out.println("number is smaller than " + userGuess);
                    } else{
                        System.out.println("number is bigger than " + userGuess);
                    }
                }
            } else {
                System.out.println("Invalid input. please enter a number");
                scanner.next();
            }
        }
    }

    //meny
    public static int menyChoise(int difficulty,Scanner scanner){
        System.out.println("\nChoose a difficulty: ");
        System.out.println("1. Easy (0-50)");
        System.out.println("2. Medium (0-100)");
        System.out.println("3. Hard (0-500)");
        System.out.println("4. Exit");

        while(true){
            if(scanner.hasNextInt()){
                difficulty = scanner.nextInt();
                switch (difficulty) {
                    case 1:
                        System.out.println("\nGuess the number from 0 to 50");
                        break;
                    case 2:
                        System.out.println("\nGuess the number from 0 to 100");
                        break;
                    case 3:
                        System.out.println("\nGuess the number from 0 to 500");
                        break;
                    case 4:
                        System.out.println("BYEEEE! ");
                        break;
                    default:
                        //no work, needs to say invalid and choose 1-4 :( BLAME THE BREAK IN THE IF STATMENT!
                        break;
                }
                break;
            }else {
                System.out.println("Invalid input. please enter a number");
                scanner.next();
            }
        }
        return difficulty;
    }

    public static int randomNumber(int difficulty, int number, Random random){
        switch (difficulty) {
            case 1:
                number = random.nextInt(51);
                break;
            case 2:
                number = random.nextInt(101);
                break;
            case 3:
                number = random.nextInt(501);
                break;
        }
        return number;
    }
}