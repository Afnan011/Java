package Practice.lab3;

import java.util.Scanner;

public class AreaAndPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch = 2;

        do
        {
            System.out.println("\n1.Find Area and Circumference of the Circle \n2.Find Prime or Not \n3.Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1:
                    System.out.print("Enter radius: ");
                    float r = sc.nextFloat();
                    findArea(r);
                    break;

                case 2:
                    System.out.print("Enter a Number: ");
                    int n = sc.nextInt();
                    if(isPrime(n))
                    {
                        System.out.println(n + " is Prime Number");
                    }
                    else{
                        System.out.println(n + " is not a Prime Number");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Enter a valid choice");
            }

        }while (ch != 3);
    }

    private static void findArea(float r)
    {
        final float PI = 3.14f;

        float area = PI * r * r;
        float cir = 2 * PI * r;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + cir);
    }

    private static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }

        for (int i = 2; i*i<=n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

}
