package Another;

public class BinarySearchDemo {
    public static void main(String[] args) {
        searchInsert(new int[]{1, 3, 5, 9},2);

    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearch(0, nums.length, nums, target);
    }

    static int binarySearch(int startFrom, int endPosition, int[] nums, int target){
        int mid = 1 + (endPosition - startFrom) / 2;
        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] > target) {
            return binarySearch(startFrom, mid - 1 , nums, target);
        } else if (nums[mid] < target) {
            return binarySearch(mid + 1, endPosition, nums, target);
        } else {
            return startFrom + 1;
        }
    }
}
