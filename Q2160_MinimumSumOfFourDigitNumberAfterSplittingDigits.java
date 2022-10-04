import java.util.Arrays;

public class Q2160_MinimumSumOfFourDigitNumberAfterSplittingDigits {

    // Input: num, a 4 digit integer
    // Output: num is split into two new integers new1 and new2 using digits found in num.
    //         Returns the smallest possible sum of new1 and new2.
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num = num / 10;
        }
        Arrays.sort(arr);
        return (arr[0] + arr[1]) * 10 + arr[2] + arr[3];
    }

}
