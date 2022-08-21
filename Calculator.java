package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator;
        double number1, number2, result;

        System.out.println("Choose an operator: +,-,* or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number:");
        number1 = input.nextDouble();

        System.out.println("Enter second number :");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;

            default:
                System.out.println("Invalie operator!");
                break;

        }
        input.close();
    }

}
