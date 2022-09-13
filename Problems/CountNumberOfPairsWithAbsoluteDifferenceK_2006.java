public class CountNumberOfPairsWithAbsoluteDifferenceK_2006 {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i < j && Math.abs(nums[i] - nums[j]) == k) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
