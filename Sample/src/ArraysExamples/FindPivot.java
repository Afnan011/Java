package ArraysExamples;

public class FindPivot {

    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] nums = {1,7,3,6,5,6};

        sol.pivotIndex(nums);

    }

}

class Solution {
    public int pivotIndex(int[] nums) {
        int i = 0;
        int j = nums.length-1;

        int leftSum = nums[i];
        int rightSum = nums[j];

        i++;
        j--;

        while(i < j)
        {
            if(leftSum < rightSum)
            {
                leftSum += nums[i];
                i++;
            }
            else
            {
                rightSum += nums[j];
                j--;
            }

        }

        if(leftSum == rightSum)
        {
            return i;
        }

        return -1;

    }
}
