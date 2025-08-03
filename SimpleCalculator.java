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
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next(); // discard the invalid input
                }
            }

            if(userInput == 5){
                System.out.print("Exiting calculator. BYE!");
                scanner.close();
                break; // exit loop and program
            }
            

            double number1=0, number2=0;

            while(true){
                System.out.println("\nPlease enter 1st number:");
                if(scanner.hasNextDouble()){
                    number1 = scanner.nextDouble();

                    System.out.println("Please enter 2nd number:");
                    if(scanner.hasNextDouble()){
                        number2 = scanner.nextDouble();
                        break;
                    }else {
                        System.out.println("2nd inpot is not a number");
                        scanner.next();
                    }

                }else {
                    System.out.println("1st inpot is not a number");
                    scanner.next(); // discard the invalid input
                }
            }


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