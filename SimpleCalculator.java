import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nChoose activity: ");
            System.out.println("1. Add");
            System.out.println("2. subtract");
            System.out.println("3. Multiply");
            System.out.println("4. divide");
            System.out.println("5.Exit");

            int userInput;

            //validate meny choise
            while(true){
                if(scanner.hasNextInt()){
                    userInput = scanner.nextInt();
                    if(userInput >= 1 && userInput <= 5){
                    break;
                    }else {
                        System.out.println("Please enter a number between 1 and 5.");
                    }
                }else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // consume the invalid input
                }
            }
            

            if(userInput == 5){
                System.out.print("Exiting calculator. BYE!");
                scanner.close();
                break; // exit loop and program
            }

            System.out.println("choose 1st number: ");
            double number1 = scanner.nextDouble();
            System.out.println("choose 2nd number");
            double number2 = scanner.nextDouble();

            double result =0;

            switch(userInput){
                case 1:{
                    result = number1 + number2;
                    System.out.print(number1 + " + " + number2);
                    break;
                }
                case 2:{
                    result = number1 - number2;
                    System.out.print(number1 + " - " + number2);
                    break;
                }
                case 3:{
                    result = number1 * number2;
                    System.out.print(number1 + " * " + number2);
                    break;
                }
                case 4:{
                    if(number2 !=0){
                    result = number1 / number2;
                    System.out.print(number1 + " / " + number2);
                    } else{
                        System.out.println("cannot divide by zero");
                        continue;
                    }
                    break;
                }
                default:
                    System.out.print("Invalid operation.");
                    continue;
            }

            System.out.print(" = " + result);
            
        }
        scanner.close();
    }
}