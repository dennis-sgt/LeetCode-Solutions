public class CountGoodTriplets_1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) <= a) {
                    for(int k = 0; k < arr.length; k++) {
                        if(0 <= i && i < j && j < k && k < arr.length) {
                            if(Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
