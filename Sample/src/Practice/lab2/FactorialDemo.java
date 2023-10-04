package Practice.lab2;

public class FactorialDemo {
    public static void main(String[] args) {
        factorial(10);
    }

    private static void factorial(int n)
    {
        int fact = 1;
        int i = 1;

        while (i <= n)
        {
            System.out.println(i + "! = " + fact);
            i++;
            fact *= i;
        }

    }

}
