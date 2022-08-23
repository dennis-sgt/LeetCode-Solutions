public class RunningSumOf1dArray_1480 {
    public static int[] runningSum(int[] nums) {

        int[] intArr = new int[nums.length];

        intArr[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            intArr[i] = nums[i] + intArr[i - 1];
        }
        return intArr;
    }
}
