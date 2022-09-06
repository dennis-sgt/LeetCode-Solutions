public class ShuffleTheArray_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int k = 0;

        for(int i = 0; i < arr.length; i += 2) {
            arr[i] = nums[k];
            arr[i + 1] = nums[k + n];
            k++;
        }

        return arr;
    }
}
