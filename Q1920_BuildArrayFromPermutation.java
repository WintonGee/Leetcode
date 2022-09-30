public class Q1920_BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[nums[i]];
        return arr;
    }

}
