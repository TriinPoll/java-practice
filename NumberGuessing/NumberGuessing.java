import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main (String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(101); //0 to 100
        int userInput, counter=0;

        System.out.println(number);

        while(true){
            System.out.println("\nGuess the number from 0 to 100: ");
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