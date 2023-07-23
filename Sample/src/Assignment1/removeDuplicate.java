package Assignment1;

import java.util.*;

public class removeDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter "+ n+ " elements: ");
        for (int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        int[] res = duplicate(a);

        System.out.println("Array after removing duplicate elements: ");
        for (int i: res)
        {
            System.out.print(i + "  ");
        }
        System.out.println();

    }

    public static int[] duplicate(int[] arr) {
        // Convert the array to a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }
}
