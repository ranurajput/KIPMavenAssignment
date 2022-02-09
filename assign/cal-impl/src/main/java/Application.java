import com.knoldus.Calculator;

import java.util.Scanner;
import java.lang.*;

public class Application {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        Calculator calculate = new Calculator();


        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter Option Number:");

        int number=userInput.nextInt();

        if(number>0 && number<5){           //Checks if correct option entered.

            System.out.println("Enter Two Numbers");

            int firstNumber=userInput.nextInt();
            int secondNumber= userInput.nextInt();

            userInput.nextLine();

            switch(number)
            {
                case 1:System.out.println("Result="+ calculate.addition(firstNumber,secondNumber));
                    break;
                case 2:System.out.println("Result="+ calculate.subtraction(firstNumber,secondNumber));
                    break;
                case 3:System.out.println("Result="+ calculate.multiplication(firstNumber,secondNumber));
                    break;
                case 4:System.out.println("Result="+ calculate.division(firstNumber,secondNumber));
                    break;
            }
        }
        else{
            System.out.println("");
        }
        userInput.close();
    }
}