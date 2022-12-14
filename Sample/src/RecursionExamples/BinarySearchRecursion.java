package RecursionExamples;

public class BinarySearchRecursion {

    public static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, end);
        }

        return binarySearch(arr, target, start, mid - 1);

    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int target = 66;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

}
