package Problem1;

import java.util.Scanner;

public class Calculator {

    /*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
        Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
        Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/

    public double calculate(double first_number, double second_number, String operationType) {

        switch(operationType){
            case "+":
                return add(first_number, second_number);
            case "-":
                return sub(first_number, second_number);
            case "*":
                return mul(first_number, second_number);
            case "/":
                return div(first_number, second_number);
            default:
                throw new IllegalArgumentException("Invalid operation type");

        }
    }

    public double add(double first_number, double second_number ) {
        return first_number + second_number;
    }

    public double sub(double first_number, double second_number ) {
        return first_number - second_number;
    }

    public double mul(double first_number, double second_number ) {
        return first_number * second_number;
    }

    public double div(double first_number, double second_number ) {
        if(second_number == 0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return first_number / second_number;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("Enter Operand");
            double first_number = s.nextInt();
            double second_number = s.nextInt();

            System.out.println("Enter Operation");
            String operationType = s.next();

            double ans = calculator.calculate(first_number,second_number,operationType);
            System.out.println("Answer: " + ans);
        }

        catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        s.close();
    }
}
