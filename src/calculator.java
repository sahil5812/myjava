import java.util.Scanner;

public class calculator {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = false;

        System.out.println("Enter 1st no.");
        num1 = scanner.nextDouble();

        System.out.println("*,/,+,-,^");
        operator = scanner.next().charAt(0);

        System.out.println("Enter 2nd no.");
        num2 =  scanner.nextDouble();

        switch (operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' ->{

                if (num2 == 0){

                    System.out.println("Number cannot divide by zero!");
                    validOperator = false;
                }else {

                    result = num1 / num2;

                }

            }

            case '^' -> result = Math.pow(num1,num2);

            default ->{
                System.out.println("Invalid operator!");
                validOperator = false;
            }


        }
        if (validOperator){
        System.out.println(result);
        }
    }

}
