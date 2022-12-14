package RecursionExamples;

public class RecursionEx2 {

    public static void display(int n) {

        if (n == 0) {
            return;
        }
        display(n - 1);

        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        display(5);
    }

}
