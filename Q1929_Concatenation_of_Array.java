public class Q1929_Concatenation_of_Array {

    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }

}
