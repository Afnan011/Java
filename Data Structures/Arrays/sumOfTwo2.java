import java.util.HashSet;
import java.util.Set;

//Time complexity = O(n)T
//Space complexity = O(n)S

public class sumOfTwo2{
    
    public static int[] sumOfTwoInt(int[] arr, int target) {
        Set<Integer> nums = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int match = target - num;
            
            if (nums.contains(match)) {
                return new int[] {num, match};
            }
            else{
                nums.add(num);
            }
        }

        return new int[0];
    }

    
    
    public static void main(String[] args) {
        
        int[] arr = {6, 2, 5, 4, 9, 0};
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