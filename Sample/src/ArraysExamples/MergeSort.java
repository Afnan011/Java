package ArraysExamples;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int a[] = new int[] {1,3,4, 0, 0, 0};
        int m = 3;
        int b[] = new int[]{2,5,7};
        int n = 3;

        merge(a, m, b, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {


            int i, j, k;
            i = j = k = 0;

            int res[] = new int [m+n];


            while(i < m && j < n)
            {
                if(nums1[i] <= nums2[j])
                {
                    res[k++] = nums1[i++];
                }
                else
                {
                    res[k++] = nums2[j++];
                }
            }

            while(j != n)
            {
                res[k++] = nums2[j++];
            }

            while(i != m)
            {
                res[k++] = nums1[i++];
            }


            System.out.println(Arrays.toString(res));
        }

}
