package Exam2;

import java.util.Scanner;

public class DivisionByZeroDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();

            double res = a/b;
            System.out.println("Result = "+ res);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide a number by zero");
        }

    }

}
