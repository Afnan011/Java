package Practice.lab1;

public class PatternDemo {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
