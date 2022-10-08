import java.util.Arrays;

public class Q1877_MinimizeMaximumPairSumInArray {

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(nums[left] + nums[right], max);
            left++;
            right--;
        }
        return max;
    }

}
