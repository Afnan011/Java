package Practice.lab4;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try{
            double res = num1 / num2;
            System.out.println("Result = " + res);

        }
        catch (ArithmeticException e)
        {
            System.out.println("ERROR: Cannot divide a number with 0");
        }

    }
}
