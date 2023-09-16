package BinarySearch;

public class FindTargetInMountainArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 7, 9};
        int[] nums2 = {9, 5, 3, 2, 1};

        int[] nums3 = {1,2,3,5,6,4};

//        System.out.println(binarySearch(nums, 7));
//        System.out.println(binarySearch(nums, 7));
        System.out.println(search(nums3, 5));

    }

    private static int search(int[] nums, int target)
    {
        int peak = findPeakIndex(nums);

        int first = binarySearch(nums, 0, peak, target);
        if(first != -1)
        {
            return first;
        }

        int second = binarySearch(nums, peak+1, nums.length-1, target);

        return second;
    }


    private static int binarySearch(int[] nums, int start, int end, int target) // order agnostic binary search
    {
        boolean isAsc = nums[0] < nums[nums.length-1];

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(target == nums[mid])
            {
                return  mid;
            }

            if(isAsc)
            {
                if(target > nums[mid])
                {
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }
            else
            {
                if(target < nums[mid])
                {
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }


        }

        return -1;
    }


    private static int findPeakIndex(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;

        while(start < end)
        {
            int mid = start + (end - start )/2;

            if(nums[mid] > nums[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }

        return start;
    }

}
