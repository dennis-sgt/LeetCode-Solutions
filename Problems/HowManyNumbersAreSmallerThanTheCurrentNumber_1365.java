public class HowManyNumbersAreSmallerThanTheCurrentNumber_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i] && nums[j] != nums[i]) {
                    count++;
                }
            }
            output[i] = count;
            count = 0;
        }

        return output;
    }
}
