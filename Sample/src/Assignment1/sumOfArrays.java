package Assignment1;

import java.util.Scanner;

public class sumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;

        int[] a = new int[n];
        int[] b = new int[n];

        int[] c = new int[n*2];
        int j = 0;

        System.out.printf("Enter array1 elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            c[j++] = a[i];
        }

        System.out.printf("Enter array1 elements:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            c[j++] = b[i];
        }

        for (int i = 0; i<n*2;i++)
        {
            System.out.print(c[i] + "  ");
        }

    }
}
