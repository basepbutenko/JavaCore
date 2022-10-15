public class LeetCodeTwoSum {

    public static void main(String[] args) {
/*
* Input: nums = [2,7,11,15], target = 9
  Output: [0,1]
  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
* */
//        int[] x = twoSum(new int[]{2, 7, 34, 5}, 9);
        int[] x = twoSum(new int[]{55, 22, 21, 9, 8}, 64);
        System.out.println(x[0]);
        System.out.println(x[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int target2;

        for (int i = 0; i < nums.length; i++) {
            int element1 = nums[i];
            target2 = target - element1;
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (target2 == nums[j]) {
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
