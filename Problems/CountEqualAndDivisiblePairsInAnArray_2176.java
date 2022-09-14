public class CountEqualAndDivisiblePairsInAnArray_2176 {
    public int countPairs(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(0 <= i && i < j && j < nums.length) {
                    if (nums[i] == nums[j] && i * j % k == 0) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
