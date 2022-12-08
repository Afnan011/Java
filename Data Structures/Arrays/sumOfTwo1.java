//Time complexity = O(n^2)
//Space complexity = O(1)S

public class sumOfTwo1{
    
    public static int[] sumOfTwoInt(int[] arr, int target) {
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return new int[0];
    }

    
    
    public static void main(String[] args) {
        
        int[] arr = {6, 2, 5, 5, 9, 0};
        int target = 10;
        int[] result = sumOfTwoInt(arr, target);


        if (result.length > 0) {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        } else {
            System.out.println("No elements found");
        }


    }
}