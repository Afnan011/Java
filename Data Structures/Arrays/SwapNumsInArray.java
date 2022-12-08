public class SwapNumsInArray {

    public static int maxCountItem(int[] arr) {

        int maxCount = 0;
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr[i];
                }

            }

        }
        return maxValue;

    }

    public static int[] swap(int[] arr) {

        int n = arr.length;
        int maxValue = maxCountItem(arr);

        for (int i = 0; i < n; i++) {

            for (int j = n - 1; j >= i; j--) {

                if (arr[j] == maxValue) {
                    continue;
                } else {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 6, 1, 6, 8, 10, 4, 15, 6, 3, 9, 6 };
        int[] result = swap(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
