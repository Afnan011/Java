package Assignment1;

public class MathOperations {

    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        // Adding integers
        int sum1 = math.add(5, 10);
        System.out.println("Sum of integers: " + sum1);

        // Adding doubles
        double sum2 = math.add(1.2, 2.3);
        System.out.println("Sum of doubles: " + sum2);

        // Calculating average
        double avg = math.average(12, 14, 16);
        System.out.println("Average of three integers: " + avg);

        // Finding maximum
        int max = math.findMax(7, 12, 66, 9);
        System.out.println("Maximum of four integers: " + max);
    }
}


class MathOperation
{
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double average(int num1, int num2, int num3) {
        return  (num1 + num2 + num3) / 3;
    }

    public int findMax(int ...a) {
        int max = a[0];

        for (int i: a)
        {
            if(i > max)
                max = i;
        }

        return max;
    }
}
